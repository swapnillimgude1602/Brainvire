package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.aggregation.SortOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.example.demo.Collection.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService implements UserServiceIf {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		User userSave = this.userRepository.save(user);
		return userSave;
	}

	@Override
	public List<User> getUserStartWith(String name) {
		// TODO Auto-generated method stub
		List<User> users = this.userRepository.findByUserFirstNameStartsWith(name);
		return users;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);

	}

	@Override
	public List<User> getUserByAge(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return userRepository.findByUserAgeBetween(minAge, maxAge);
	}

	@Override
	public Page<User> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable) {
		// TODO Auto-generated method stub
		Query query = new Query().with(pageable);
		List<Criteria> criterias = new ArrayList<>();

		if (name != null && !name.isEmpty()) {
			criterias.add(Criteria.where("userFirstName").regex(name, "i"));
		}
		if (minAge != null && maxAge != null) {
			criterias.add(Criteria.where("userAge").gte(minAge).lte(maxAge));
		}
		if (city != null && !city.isEmpty()) {
			criterias.add(Criteria.where("address.city").is(city));
		}

		// adding to criteria
		if (!criterias.isEmpty()) {
			query.addCriteria(new Criteria().andOperator(criterias.toArray(new Criteria[0]))); // converting list of
																								// criteria to array.
		}

		// using mongo db template to fetch the data in pagination format

		Page<User> user = PageableExecutionUtils.getPage(mongoTemplate.find(query, User.class), pageable,
				// (gets the entire list)(pageable:What type of data we need)
				() -> mongoTemplate.count(query.skip(0).limit(0), User.class)); // supplier to get the count
		return user;
	}

	@Override
	public List<Document> getOldestUserByCity() {
		// TODO Auto-generated method stub
		UnwindOperation unwindOperation = Aggregation.unwind("address");
		SortOperation sortOperation = Aggregation.sort(Sort.Direction.DESC, "userAge");
		GroupOperation groupOperation = Aggregation.group("address.city").first(Aggregation.ROOT).as("oldestPerson");

		Aggregation aggregation = Aggregation.newAggregation(unwindOperation, sortOperation, groupOperation);

		List<Document> users = mongoTemplate.aggregate(aggregation, User.class, Document.class).getMappedResults();
		return users;
	}

	@Override
	public List<Document> getPopulationByCity() {
		// TODO Auto-generated method stub
		UnwindOperation unwindOperation = Aggregation.unwind("address");
		GroupOperation groupOperation = Aggregation.group("address.city").count().as("popCount");
		SortOperation sortOperation = Aggregation.sort(Sort.Direction.DESC, "popCount");

		ProjectionOperation projectionOperation = Aggregation.project().andExpression("_id").as("city")
				.andExpression("popCount").as("count").andExclude("_id");

		Aggregation aggregation = Aggregation.newAggregation(unwindOperation, groupOperation, sortOperation,
				projectionOperation);

		List<Document> users = mongoTemplate.aggregate(aggregation, User.class, Document.class).getMappedResults();
		return users;
	}

}

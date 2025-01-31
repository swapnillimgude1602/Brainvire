package JunitMockito.com.demo.ExceptionHandling;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {

	List<User> findAllUsers() throws SQLException;

	void save(User user) throws SQLException;
}

package JunitMockito.com.demo.AnnotationStub;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);

}

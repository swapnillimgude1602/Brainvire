package JunitMockito.com.demo.Stub;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);

}

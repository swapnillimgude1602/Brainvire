package JunitMockito.com.demo.BDD_Stubbing;

import java.util.List;

public interface UserRepository {

	List<User> findNewUsers(int days);

}

package JunitMockito.com.demo.exceptionHandlingTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.ExceptionHandling.DatabaseReadException;
import JunitMockito.com.demo.ExceptionHandling.DatabaseWriteException;
import JunitMockito.com.demo.ExceptionHandling.User;
import JunitMockito.com.demo.ExceptionHandling.UserRepository;
import JunitMockito.com.demo.ExceptionHandling.UserService;

@ExtendWith(MockitoExtension.class)
public class testExceptionHandling {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@Test
	public void testTotalSalary() throws DatabaseReadException, SQLException {
		when(userRepository.findAllUsers()).thenThrow(SQLException.class);
		assertThrows(DatabaseReadException.class,()->userService.findAllUsers());	
	}

	@Test
	public void testTotalSalary1() throws DatabaseReadException, SQLException {
		when(userRepository.findAllUsers()).thenThrow(new SQLException("Database not found"));
		assertThrows(DatabaseReadException.class,()->userService.findAllUsers());	
	}

	@Test
	public void testAddUser() throws SQLException {
		User user = new User(1, "Swapnil", "Pune", "123", 500);
		doThrow(SQLException.class).when(userRepository).save(user);
		assertThrows(DatabaseWriteException.class, () -> userService.addUser(user));
	}
}
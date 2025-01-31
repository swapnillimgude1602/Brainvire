package JunitMockito.com.demo.BDD_BehaviorVerificationTest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import JunitMockito.com.demo.BDD_BehaviorVerification.User;
import JunitMockito.com.demo.BDD_BehaviorVerification.UserRepository;
import JunitMockito.com.demo.BDD_BehaviorVerification.UserService;

@ExtendWith(MockitoExtension.class)
public class TestBehaviorVerification {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

	@Test
	public void testUpdateSalary2() {
		User user = new User(5, "swapnil", "pune", "123", 400);
		when(userRepository.findUserByUserId(5)).thenReturn(user);
		userService.updateSalary(5, 400);
		verify(userRepository).findUserByUserId(5);
		verify(userRepository).save(user);
		verifyNoMoreInteractions(userRepository);
	}
	
	@Test
	public void test_given_Salary_When_UpdateSalaryisCalledWithNewSalary_Then_SalaryisUpdated(){
		
		//given - arrange
		User user = new User(5, "swapnil", "pune", "123", 400);
		given(userRepository.findUserByUserId(5)).willReturn(user);
		
		//when - act
		userService.updateSalary(5, 1000);
		
		//then - assert
		then(userRepository);
	}

}
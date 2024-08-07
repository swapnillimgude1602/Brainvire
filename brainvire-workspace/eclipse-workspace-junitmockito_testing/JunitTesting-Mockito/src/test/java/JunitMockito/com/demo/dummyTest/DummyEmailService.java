package JunitMockito.com.demo.dummyTest;

import JunitMockito.com.demo.Dummy.EmailService;

public class DummyEmailService implements EmailService{

	@Override
	public void sendEmail(String messgae) {
		// TODO Auto-generated method stub
		throw new AssertionError("Method not implemented");
		
	}

}

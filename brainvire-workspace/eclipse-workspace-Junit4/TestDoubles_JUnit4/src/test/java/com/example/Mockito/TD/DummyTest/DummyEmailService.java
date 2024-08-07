package com.example.Mockito.TD.DummyTest;

import com.example.Mockito.TD.Dummy.EmailService;

public class DummyEmailService implements EmailService{

	@Override
	public void sendEmail(String message) {
		// TODO Auto-generated method stub
		throw new AssertionError("MEthid not implemented");
		
	}

}

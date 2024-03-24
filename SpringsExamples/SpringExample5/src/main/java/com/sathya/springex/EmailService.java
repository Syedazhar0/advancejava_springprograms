package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService  implements MessageService{

	@Override
	public void message() {
				System.out.println("email services are block for your email_id");
	}

}

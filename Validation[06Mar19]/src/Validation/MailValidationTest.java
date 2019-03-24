package Validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MailValidationTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		MailValidation v= new MailValidation();
		assertEquals("Valid", v.MailValidation());
	}

}

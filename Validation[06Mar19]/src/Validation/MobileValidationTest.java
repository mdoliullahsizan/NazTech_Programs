package Validation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Validation.MobileValidation;

class MobileValidationTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		MobileValidation v= new MobileValidation();
		assertEquals("Valid", v.ValidationTest());
	}

}

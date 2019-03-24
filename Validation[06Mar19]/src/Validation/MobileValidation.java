package Validation;

public class MobileValidation {

	public String ValidationTest() {
		String mob = "0164639296";
		String s= "";
		int len = mob.length();

		if (mob.length() == 11) {
			if (mob.startsWith("016") || mob.startsWith("017") || mob.startsWith("018") || mob.startsWith("019")  ) {
				s= "Valid";
			} else {
				s= "Not Valid.";
			}
		}
		
		return s;

	}

}

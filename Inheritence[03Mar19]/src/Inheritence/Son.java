package Inheritence;

public class Son extends Parents {
	
		String language= null;
		
		public Son(String name, String skinColor, String height, String weight) {
			super (name, skinColor, height, weight);
			this.language= language;
		}
		@Override
		public void details() {
			super.details();
			System.out.println("Language: "+language);
		}
		
		

}

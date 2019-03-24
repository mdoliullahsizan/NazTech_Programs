package Inheritence;
public class Parents {
	String name, skinColor, height, weight;
	
	public void details() {
		name= "Sizan";
		skinColor= "Chocolate";
		height= "5.7";
		System.out.println("Name= "+name+"\n"+"Skin Color= "+skinColor+"\n"+ "Height= "+height);
	}

	public Parents(String name, String skinColor, String height, String weight) {
		super();
		this.name = name;
		this.skinColor = skinColor;
		this.height = height;
		this.weight = weight;
	}
	
	
	

}

package Project01;

public class Human extends Person implements Student {
	protected String feeling;
	protected String thought;
	protected String humanity;
	
	//With Inherited 'extends Person'
	public Human(int id, String name, int age, String gender, String address, String feeling, String thought,
			String humanity) {
		super(id, name, age, gender, address);
		this.feeling = feeling;
		this.thought = thought;
		this.humanity = humanity;
	}

	//toString
	@Override
	public String toString() {
		return "Human [feeling=" + feeling + ", thought=" + thought + ", humanity=" + humanity + ", ID=" + getId()
				+ ", Name=" + getName() + ", Age=" + getAge() + ", Gender=" + getGender()
				+ ", Address=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
//	//Without Inherited 'extends Person'
//	public Human(String feeling, String thought, String humanity) {
//		super();
//		this.feeling = feeling;
//		this.thought = thought;
//		this.humanity = humanity;
//	}
	
	
	@Override
	public void study() {
		
	}
	
	@Override
	public void exam() {
		
	}
	
	

}

package Project01;

public class Main {

	public static void main(String[] args) {
//		Person p= new Person();
//		p.setName("Sizan");
//		p.getName();
//		
//		System.out.println(p.getName());
		
		
		
		Person p= new Person(318, "Sizan", 23, "Male", "Mirpur");
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getGender());
//		System.out.println(p.getAddress());
		
		
		
//		p.toString();
		
		Human h= new Human(318, "Sizan", 23, "Male", "Mirpur", "feeling", "thought", "humanity");
		String s= h.toString();
		System.out.println(s);

	}

}

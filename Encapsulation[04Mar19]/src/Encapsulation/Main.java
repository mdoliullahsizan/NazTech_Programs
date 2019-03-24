package Encapsulation;
import Encapsulation.Employee; //4

public class Main {

	public static void main(String[] args) {
		Employee e= new Employee();
		String name= e.name;
		int id= e.id;
		
		System.out.println(name);
		System.out.println(id);

	}

}

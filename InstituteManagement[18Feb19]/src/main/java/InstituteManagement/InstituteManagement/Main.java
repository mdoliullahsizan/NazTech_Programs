package InstituteManagement.InstituteManagement;
import java.util.ArrayList; // import the ArrayList class



public class Main {

	public static void main(String[] args) {

		Student s1=new Student(1,"A");
		Student s2=new Student(2,"B");
		Student s3=new Student(1,"C");
		Student s4=new Student(2,"D");
		
		Department dt1= new Department();
//		Dept dt2= new Dept(2,s1);
//		Dept dt3= new Dept(3,s1);
	 
		
		dt1.add(s1);
		dt1.add(s2);
		dt1.add(s3);
		dt1.add(s4);
		dt1.add(s2);
		dt1.add(s3);
		
		dt1.show();
		Institute t1 = new Institute();
		t1.add(dt1);
		t1.add(dt1);
		t1.add(dt1);
		//System.out.println(t1.show());
	}

}

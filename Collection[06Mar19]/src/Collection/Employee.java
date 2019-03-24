package Collection;

import java.util.ArrayList;
import java.util.List;

//public class Employee {
//	public String id, name, salary, dept;
//	
//	public String[] data= { "318", "Sizan", "4000", "IT" };
//	ArrayList list= new ArrayList();
	
public class Employee {
	public static void main(String[] args) {
		String id, name, salary, dept;
		
		String[] data1= { "311", "S", "1000", "IT1" };
		String[] data2= { "312", "I", "2000", "IT2" };
		String[] data3= { "313", "Z", "3000", "IT3" };
		
//			ArrayList<String> list1= new ArrayList();
//		ArrayList<Integer> list1= new ArrayList();
		//ArrayList<Student> list1= new ArrayList();
		List<Student> list1= new ArrayList();
			
			for (int i= 0; i<data1.length; i++) {

				list1.add(data1[i]);
			}
			System.out.println(list1);
			
			ArrayList list2= new ArrayList();
			
			for (int i= 0; i<data2.length; i++) {

				list2.add(data2[i]);
			}
			System.out.println(list2);
			
			list1.addAll(list2);
			System.out.println(list1);
			
		
	}

}



  
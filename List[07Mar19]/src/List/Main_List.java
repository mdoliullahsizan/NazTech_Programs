package List;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main_List {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("Md");
		list.add("Oliullah");
		list.add("Sizan");
		
		for (String x:list) {
			System.out.println(x);
		}
		
		System.out.println("");
		list.addFirst("Hey");
		list.addLast("Bye");
		
//		list.removeLast();
		
		System.out.println();
		
		for (String x:list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("index: " +list.get(2));
//		list.subList(1, 3);
		System.out.println(list.subList(1, 4));
		
		list.subList(1, 2).clear();
		System.out.println();
		
		for (String x: list) {
			System.out.println(x);
		}
		

	}

}

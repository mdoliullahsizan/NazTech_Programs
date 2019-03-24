package Payment_bKashPaypal;

import java.util.LinkedList;

public class Main_Payment {

	public static void main(String[] args) {
		String[] bKash= { "A", "B", "C", "D", "E" };
		String[] Paypal= { "P","Q", "R", "S", "T" };
		
		LinkedList<String> list= new LinkedList<String>();
		
		int i;
		for (i=0; i<bKash.length; i++) {
			list.add(bKash[i]);
		}
		for (i=0; i<Paypal.length; i++) {
			list.add(Paypal[i]);
		}
		
		int x= bKash.length;
		int y= Paypal.length;
		
		System.out.println(list);
		System.out.println(list.subList(0, 10));
//		System.out.println(list.subList(x-2, x+y));
		
//		//List to Array
//		list.toArray(new String[list.size()]);
		String[] a= list.toArray(new String[list.size()]);
		
		for (i=0; i<bKash.length + Paypal.length; i++) {
			System.out.println("ArrayList :" +a[i]);
		}

	}

}
  



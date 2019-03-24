package Calculator;

import java.util.Scanner;
import Calculator.Main;

public class Multiplication {
	public static void main(String[] args) {
		float x, y, z;
		
		System.out.println("Enter two values: ");
		Scanner in= new Scanner(System.in);
		
		x= in.nextInt();
		y= in.nextInt();
		z= x * y;
		
		System.out.println("Multiplication= " +z);

	}

}

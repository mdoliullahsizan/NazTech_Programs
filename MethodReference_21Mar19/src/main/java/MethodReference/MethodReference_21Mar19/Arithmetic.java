//Source:  https://www.javatpoint.com/java-8-method-reference 


package MethodReference.MethodReference_21Mar19;

import java.util.function.BiFunction;

class Arithmetic1 {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class Arithmetic {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic1::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}

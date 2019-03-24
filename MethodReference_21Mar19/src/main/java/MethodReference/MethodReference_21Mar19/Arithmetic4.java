//Source:  https://www.javatpoint.com/java-8-method-reference 


package MethodReference.MethodReference_21Mar19;

import java.util.function.BiFunction;

class Arithmetic3 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class Arithmetic4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic3::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic3::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic3::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}



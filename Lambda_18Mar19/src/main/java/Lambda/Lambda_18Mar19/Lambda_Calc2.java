package Lambda.Lambda_18Mar19;

interface Calculator{
	int value(int a, int b);
}

class Lambda_Calc2{
	
	//Addition
	int add(int p, int q) {
		int x= p;
		int y = q;
		Calculator c1 = (a,b)->(a+b);
			System.out.println("Addition: "+c1.value(x, y));
				
		return x+y;
	}
	//Subtraction
	int sub(int p, int q) {
		int x= p;
		int y = q;
		Calculator c2 = (a,b)->(a-b);
			System.out.println("Subtraction: "+c2.value(x, y));
				
		return x-y;
	}
	//Multiplication
	int mul(int p, int q) {
		int x= p;
		int y = q;
		Calculator c3 = (a,b)->(a*b);
			System.out.println("Multiplication: "+c3.value(x, y));
				
		return x*y;
	}
	
	//Division
	int div(int p, int q) {
		int x= p;
		int y = q;
		
			try {
				Calculator c4 = (a,b)->(a/b);
					System.out.println("Division: "+c4.value(x, y));
				
			} catch (ArithmeticException e) {
				System.out.println(e);
				
			}
				
		return x/y;
	}
}



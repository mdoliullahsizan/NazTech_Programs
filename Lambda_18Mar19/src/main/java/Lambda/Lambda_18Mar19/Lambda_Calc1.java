package Lambda.Lambda_18Mar19;

class Lambda_Calc1 {
	int lambda_calc() {
		
		Claculator c=(a,b)->{
			
			int y = b;
			if(y==0)
			{
				System.out.println("The value of b is zero, So division can't be possible");
				int add = a+b;
				int sub = a-b;
				int mul = a*b;
				System.out.println("Addition: "+add+" Subtraction: "+sub+" Multiplication: "+mul);
				
			}
			else
			{
				int add = a+b;
				int sub = a-b;
				int mul = a*b;
				int div = a/b;
				System.out.println("Addition: "+add+" Subtraction: "+sub+" Multiplication: "+mul+" Divisoin: "+div);
			}
				
		};
		c.value(10, 0);
		
		return 0;
	}

	
}


interface Claculator{
	void value(int a, int b);
}



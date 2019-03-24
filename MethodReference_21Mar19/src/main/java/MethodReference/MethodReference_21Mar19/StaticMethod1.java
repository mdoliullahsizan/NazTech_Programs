//Source:  https://www.javatpoint.com/java-8-method-reference 

package MethodReference.MethodReference_21Mar19;

public class StaticMethod1 {
	public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(StaticMethod1::ThreadStatus);  
        t2.start();       
    }

}

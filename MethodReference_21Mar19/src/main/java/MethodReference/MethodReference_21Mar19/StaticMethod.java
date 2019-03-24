//Source:  https://www.javatpoint.com/java-8-method-reference 


package MethodReference.MethodReference_21Mar19;

interface Sayable{  
    void say();  
}
public class StaticMethod 
{
	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = StaticMethod::saySomething;  
        // Calling interface method  
        sayable.say();  
    } 
}

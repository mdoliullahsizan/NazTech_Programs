// A Java program to demonstrate working on enum
package ENUM_Constructor_Example;
import java.util.Scanner;

// An Enum class 
enum Day 
{ 
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	THURSDAY, FRIDAY, SATURDAY; 
} 

// Driver class that contains an object of "day" and 
// main(). 
public class EnumDay 
{ 
	Day day; 

	// Constructor 
	public EnumDay(Day day) 
	{ 
		this.day = day; 
	} 

	// Prints a line about Day using switch 
	public void dayIsLike() 
	{ 
		switch (day) 
		{ 
		case MONDAY: 
			System.out.println("Mondays are bad."); 
			break; 
		case FRIDAY: 
			System.out.println("Fridays are better."); 
			break; 
		case SATURDAY: 
			System.out.println("Saturdays are better."); 
			break;
		case SUNDAY: 
			System.out.println("Weekends are best."); 
			break; 
		default: 
			System.out.println("Midweek days are so-so."); 
			break; 
		} 
	} 

	// Driver method 
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		String day= sc.nextLine();
		//String str = "MONDAY"; 
		EnumDay t1 = new EnumDay(Day.valueOf(day)); 
		//EnumDay t1 = new EnumDay.(Day.valueOf(day));
		t1.dayIsLike(); 
	} 
} 

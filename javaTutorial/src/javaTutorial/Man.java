
package javaTutorial;
import java.util.Scanner;
public class Man extends Person implements Father
{
	
	int salary =0; // defining salary
	
	
	public  Man(String n, int a, int s)// constructor no need of class in public man
	{
		super(n,a); 
		
		 salary = s;
	}

public void task() //overriding the method in father interface
{
	System.out.println("Earn Money");
	System.out.println("Salary of Person is:"+salary);
}
	// main class
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter Name :");
	String person_name =scan.next();
	
	System.out.println("Enter Age :");
    int person_age =scan.nextInt();
	
	System.out.println("Enter Salary :");
	int person_salary =scan.nextInt();
	
	Man m = new Man(person_name,person_age,person_salary);	//making object & passing details()
	
	m.show_person();
	m.task();
		
	}

}

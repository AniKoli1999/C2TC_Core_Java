//multi Inheritance GrandChild class
package javaTutorial;
import java.util.Scanner;
public class GrandChild extends Child
{
	String gender = " ";
	public GrandChild(String n, int a, String g)// inheritance
	{
		super(n,a);
		
		gender =g;
	}

	public void show_gender()
	{
		System.out.println("Gender is: "+ gender);
	}
	
     public static void main(String[] args)
     {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String person_name = scan.next();
		
		System.out.println("Enter Your age:");
		int person_age = scan.nextInt();
		
		System.out.println("Enter Your gender:");
		String person_gender = scan.next();
		
	GrandChild gc = new GrandChild(person_name,person_age,person_gender);
	
	gc.show_name();
	gc.show_age();
	gc.show_gender();
	
	
}
}

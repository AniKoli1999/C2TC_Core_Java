package javaTutorial;
import java.util.Scanner;
public class Election {

	Scanner scan = new Scanner(System.in);
	String name ="";
	int age = 0;
	public void get_details() {
		System.out.println("Enter your Name:" );
		name = scan.next();
		
		System.out.println("Enter your Age:" );
		age = scan.nextInt();
	}
	
	public void show_details()  {
		if(age<18)
		{
			System.out.println("You are not eligible to Vote");
			
		}
		else
		{
			System.out.println("You are eligible to Vote");
		}
		
	}public static void main(String[]args)
{
	Election e = new Election();
	e.get_details();
	e.show_details();
	
	
	
}

}



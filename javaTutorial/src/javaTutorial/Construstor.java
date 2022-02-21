package javaTutorial;
import java.util.Scanner;
public class Construstor 
{
	String name =" ";
	int marks = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Your Name: ");
		String student_name=scan.next();
		
		System.out.println("Enter Your Marks: ");
		int student_marks=scan.nextInt();
		
		Construstor s = new Construstor(student_name, student_marks);
		s.show_details();
	}

	public Construstor(String s , int m)// constructor
	{
		name = s;
		marks= m;
		
	}
	
	public void show_details() {
		System.out.println("Name of student is:  "+ name);
		System.out.println("Marks of Student is: "+ marks);
	}


}

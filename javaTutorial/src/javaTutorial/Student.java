
package javaTutorial;
import java.util.Scanner;
public class Student {
Scanner scan = new Scanner(System.in);
String name = " ";
int marks = 0;

public void get_details() {
	System.out.println("Enter your Name:");
	name =scan.next();
	
	System.out.println("Enter your Marks:");
	marks =scan.nextInt();
	
}	
public void show_details() {
	System.out.println("Name of student is:  "+ name);
	System.out.println("Marks of Student is: "+ marks);
}

public static void main(String[] args) {
Student s = new Student();
s.get_details();
s.show_details();
}
}


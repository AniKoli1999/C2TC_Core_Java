package javaTutorial;

public class Person 
{
	String name = " ";
	int age = 0;
	 
	public Person(String n , int a)// Constructor
	{
		name =n;
		age  =a;
		
	}

	public void show_person()
	{
		System.out.println("Name of Person is :"+ name);
		System.out.println("Age of Person is :"+ age);
	}
}

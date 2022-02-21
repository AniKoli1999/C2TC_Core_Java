package javaTutorial;

public class Dog extends Animal
{
	public void animalSound()// abstract method
	{
		System.out.println("Bow Bow");
	}

	
	public static void main(String[]args)
	{
		Cat c =new Cat();
		Dog d =new Dog();
		c.animalSound();
		d.animalSound();
		
	}
}

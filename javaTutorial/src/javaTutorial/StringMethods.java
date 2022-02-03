package javaTutorial;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Integer strLength = 5;
	
		System.out.println("String length is:"+ str.length());
		System.out.println("Character of index 2 is:"+ str.charAt(2));
		System.out.println("concatenated String is:"+ str.concat( " World"));
		System.out.println("String comparison is:"+ str.compareTo(" World"));
		System.out.println("Index of o is:"+ str.indexOf(" o"));
		System.out.println("Last Index of l is:"+ str.lastIndexOf("l"));
		System.out.println("Replacing String is:"+ str.replace('e', 'a'));
		System.out.println("Substring is:"+ str.substring(2,5));
		System.out.println("Integer to String is:"+ strLength.toString());
		String str1 = " Hello ";
		System.out.println("Untrimmed string is:"+ str1);
		System.out.println("Trimmed string is:"+ str1.trim());
		
	}


	
}



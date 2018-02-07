import java.util.Random;
import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 64;
		int b = 14;
		
//		if(a > b)
//		{
//			System.out.println("A is greater");
//		}
//		else if (b > a)
//		{
//			System.out.println("B is greater");
//		}
//		else if (a == b)
//		{
//			System.out.println("A may be equal to B");
//		}
		
		
		int c = 64;
		
		if(a > b && a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > a && b > c)
		{
			System.out.println("B is greater");
		}
		else if(c > a && c > b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("They may be equal");
		}
		
		
		if(a >b)
		{
			if(a > c)
			{
				System.out.println("A is greater");
			}
		}
		else if (b > a)
		{
			if(b > c)
			{
				System.out.println("A is greater");
			}
		}
		else if (c > a)
		{
			if(c > b)
			{
				System.out.println("C is greater");
			}
		}
		else
		{
			System.out.println("They may be equal");
		}
		
		
		String phoneNumber = "706-6211584";
		
		int aChar = phoneNumber.indexOf("-");
		
		if(aChar == 3 && phoneNumber.length() == 11 ) 
		{
			System.out.println("is a phone");
		}
				
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name> ");String fName = scan.next();
		System.out.println("Enter your last name> ");String lName = scan.next();
		
		String name = fName.concat(" " + lName);
		System.out.println(name);
		
		//Build a random word generator (5 letter words)
		
		//a. have the characters in the word declared
			
		final String letters = "abcdefghijklmnopqrstuvwxyz";

		
		//b. have a random number generator
		
		Random rand = new Random();
		
		//c. use the random generator to get the charAt a random location based on the number of charecters
		
		char char1 = letters.charAt(rand.nextInt(letters.length()));
		char char2 = letters.charAt(rand.nextInt(letters.length()));
		char char3 = letters.charAt(rand.nextInt(letters.length()));
		char char4 = letters.charAt(rand.nextInt(letters.length()));
		char char5 = letters.charAt(rand.nextInt(letters.length()));
		
		//d. concatenate the charecters togeter to get the word
		
		System.out.println(""+char1+char2+char3+char4+char5);
		
	}

}

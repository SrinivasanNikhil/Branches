/**
this is a comment!!!!
 */
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {
		
		
		// Build a random password generator (8 character words)
		// a. have the characters in the word declared
		
		final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";

		// b. have a random number generator

		Random rand = new Random();

		// c. use the random generator to get the charAt a random location based on the
		// number of characters

		char char1 = letters.charAt(rand.nextInt(letters.length()));
		char char2 = letters.charAt(rand.nextInt(letters.length()));
		char char3 = letters.charAt(rand.nextInt(letters.length()));
		char char4 = letters.charAt(rand.nextInt(letters.length()));
		char char5 = letters.charAt(rand.nextInt(letters.length()));
		char char6 = letters.charAt(rand.nextInt(letters.length()));
		char char7 = letters.charAt(rand.nextInt(letters.length()));
		char char8 = letters.charAt(rand.nextInt(letters.length()));
		// d. concatenate the characters together to get the word

		System.out.println("" + char1 + char2 + char3 + char4 + char5 + char6 + char7 + char8);
		System.out.println(String.valueOf(char1)+String.valueOf(char2)+String.valueOf(char3)+String.valueOf(char4)+String.valueOf(char5)+String.valueOf(char6)+String.valueOf(char7)+String.valueOf(char8));
				

		
		
		//Build a username generator absed on lastname and firstname inputs from the user
		//Conditions: 
		//			No more than 1 username can include either the whole first or last name
		//			At least 1 username should include numbers
		//			There needs to be a random component in at least 2 name generations
		//			The usernames should adhere to the characteristics of typical usernames
		
		final String numbers = "1234567890.";
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in your first name > ");
		String fName = scan.nextLine();
		System.out.println("Type in your last name > ");
		String lName = scan.nextLine();
		
		String part1 = fName.toLowerCase().substring(0, rand.nextInt(fName.length()));
		String part2 = lName.toLowerCase().substring(0, rand.nextInt(lName.length()));
		
		System.out.println("A possible username " + part1+part2);
		
		String part3 = String.valueOf(numbers.charAt(rand.nextInt(numbers.length())));
		String part4 = String.valueOf(numbers.charAt(rand.nextInt(numbers.length())));
		
		System.out.println("A possible username " + part1+part2+part3+part4);
		
		//Take inputs and Build a decision tree that decides whether to issue a loan or not
		
		//https://www.brcommunity.com/images/articles/b624-2full.png
			

	}
	
	

}

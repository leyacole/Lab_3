import java.util.Scanner;

//Lab 3
public class Conditional {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		String username;
		int number;
		
		System.out.println("Please enter your name: ");
		username = scnr.next();
				
		System.out.println(username + ", Please enter a number between 1 - 100: ");
		number = scnr.nextInt();
				
		while (number < 1 || number > 100) {
			System.out.println(username + ", you have entered an invalid number. Please enter a number between 1 - 100: ");  //check for 0 or negative number
			number = scnr.nextInt();
		}
		
		if ((number % 2 != 0) && (number <= 60)) 
		{
			System.out.println(number + " Odd");
		}
		else if ((number % 2 == 0) && (number < 25)) 
		{
			System.out.println("Even and less than 25");
		}
		else if ((number % 2 == 0) && ((number >= 26 && number <= 60)))
		{
			System.out.println(number + " Even");
		}
		else if ((number % 2 == 0) && (number > 60))
		{
			System.out.println(number + " Even");
		}
		else if (number % 2 != 0 && number > 60)
		{
			System.out.println(number +" Odd and over 60");
		}
			
	}
			
				
}

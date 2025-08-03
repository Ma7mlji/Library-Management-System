import java.util.Scanner;

public class Main {
	public static void main(String [] args) 
	{
		SignUp signup = new SignUp();
		SignIn signin = new SignIn();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello and welcome to Candle library!");
		System.out.println("Please choose on of the following options to start: ");

		 try {
			 	while(true) {
				
			 			System.out.print(" 1- Sign Up \n 2- Sign in \n 3- Exit program \n >> ");
			 			String userAnswer = userInput.nextLine();
					switch(userAnswer) 
					{
					case "1":		
						signup.startRegisteration(userInput);
						continue;
					case "2":
						signin.startLogin(userInput);
						continue;
					case "3":
						System.out.print(" Thank you for visting Candle library, have a good day!");
						System.exit(0);
					default:
						System.out.print(" Non of the options, please try again.");
					}	
				}
			 
		 } 		catch(Exception e) {
			 			System.out.println("Error from Main Class");
			 			e.printStackTrace();
		 }
		 userInput.close();
	}
}

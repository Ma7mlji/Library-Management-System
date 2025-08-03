import java.util.Scanner;
public class SignIn 
{
	private MemberValidator validate = new MemberValidator();
	SignIn()
	{
		
	}
	
	public void startLogin(Scanner userInput) 
	{
		System.out.print("Please enter registered email: ");
		String email = userInput.nextLine();
		System.out.print("Please enter registered mobile Number: ");
		String mobileNumber = userInput.nextLine();
		if(validate.isEmailAndMobileMatched(email, mobileNumber)) 
		{
			System.out.println("Hello "+ validate.toString() + " and welcome again!");
		}
		else 
		{
			System.out.print("Invalid input, please try again.");
		}
		
	}
}

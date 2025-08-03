import java.util.Scanner;

public class SignUp 
{
	private MemberValidator validate = new MemberValidator();
	private Member member;
	public void startRegisteration(Scanner userInput) 
	{
			
		while(true) 
		{
			System.out.print("Please enter your name (or exit to go back): ");
			String name = userInput.nextLine();
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("returning back to menu...");
				break;
			}
			System.out.print("Please enter Email (or exit to go back): ");
			String email = userInput.nextLine();
			if(email.equalsIgnoreCase("exit"))
			 {
				System.out.println("returning back to menu...");
				break;
			}
			System.out.print("Please enter mobile Number (or exit to go back): ");
			String mobileNumber = userInput.nextLine();
			if(mobileNumber.equalsIgnoreCase("exit"))
			 {
				System.out.println("returning back to menu...");
				break;
			}
			if(email.trim().isEmpty() || name.trim().isEmpty() || mobileNumber.trim().isEmpty())
			{
				System.out.println("Fields can not be empty. Please try again.");
				continue;
			}
			if(validate.isEmailAndMobileMatched(email, mobileNumber)) 
			{
				System.out.println("Email or mobile number is used, please try to login.");
				continue;
			}
			else 
			{
				
				member = new Member(name,email,mobileNumber);
				member.addDataToFile();
				System.out.println("Account has been sucessfully created!");
				break;
			}
		}
		
	}

}

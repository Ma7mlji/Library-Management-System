import java.io.*;
import java.util.Scanner;
public class MemberValidator 
{
	private String lineName;
	private final File membersFile = new File("C:\\Users\\Gigabyte\\eclipse-workspace\\Library Management System\\src\\Members.txt");


	public String getLineName() 
	{
		return lineName;
	}
	@Override
	public String toString() 
	{
		return lineName;
	}
	
	public boolean isEmailAndMobileMatched(String email, String mobileNumber) {

	    try (Scanner scanner = new Scanner(membersFile)) {
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();

	            String[] parts = line.split(",");

	            if (parts.length >= 3) {
	            	 lineName = parts[0].trim();
	                String lineMobile = parts[1].trim();
	                String lineEmail = parts[2].trim();

	                if (lineEmail.equals(email) && lineMobile.equals(mobileNumber)) {
	                    return true;
	                } else if(lineEmail.equals(email) || lineMobile.equals(mobileNumber))
	                	return true;
	            }
	        }
	    } catch (FileNotFoundException e) {
	    	System.out.println("Error in MemberValidator class");
	        e.printStackTrace();
	    }

	    return false;
	}

}

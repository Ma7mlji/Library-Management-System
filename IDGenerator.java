import java.util.*;
import java.io.*;
public class IDGenerator {
	
	private Random r = new Random();
	private long memberID;
	private final File idsFile = new File("C:\\Users\\Gigabyte\\eclipse-workspace\\Library Management System\\src\\Members_ID.txt");
	
	
	public long getMemberID() {
		return memberID;
	}
	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}
	
	public void addNewIdToFile(long newID) 
	{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(idsFile,true)))
		{
			writer.write(Long.toString(newID));
			writer.newLine();
		} catch(IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void generateID() 
	{	
		long newID;

		Set <Long> filesLine = new HashSet<>();
		try(Scanner readIDsFile = new Scanner(idsFile)){
			while(readIDsFile.hasNext()) 
			{
				filesLine.add(readIDsFile.nextLong());
			}
			do {
				newID = r.nextLong(9000) + (1000);
			   } while(filesLine.contains(newID));
				setMemberID(newID);	
				addNewIdToFile(newID);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}

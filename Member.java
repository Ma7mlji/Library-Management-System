import java.io.*;
public class Member {
	private String email;
	private String mobileNumber;
	private String name;
	private long memberID;
	private final File membersFile = new File("C:\\Users\\Gigabyte\\eclipse-workspace\\Library Management System\\src\\Members.txt");
	private IDGenerator generator = new IDGenerator();
	
	Member(){}
	
	Member(String name,String email, String mobileNumber){
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.name = name; 
		generator.generateID();
		this.memberID = generator.getMemberID();
	}
	
	// Getters 
	public String getEmail() {
		return email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getName() {
		return name;
	}
	// Setters
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMemberID() {
		return memberID;
	}
	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}
	@Override
	public String toString() 
	{
		return  getName() + "," + getMobileNumber() + "," + getEmail() + "," + getMemberID();
	}
	// Adding the new members to file as database, to check letter if the data is duplicated or data exist.
	public void addDataToFile() {		
		try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(membersFile,true));
				writer.write(toString());
				writer.newLine();
				writer.close();
		} catch (IOException e) {
			System.out.println("Error in Member Class");
			e.printStackTrace();
		}
		
	}
	
	
	}




package details;

import java.util.Scanner;

public class Email {
	
	// writing private for not accessing out side class (Encapsulation)
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String email;
	private String company="company.com";
	
	
	//creating constructor for firstName and lastName
	
	public Email(String firstName,String lastName)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		
		//System.out.println("Email created :   "+firstName+" "+lastName);
		
		//calling this is to print the dept details
		this.department=setDepartment();
		System.out.println("\n Your Department:"+this.department);
		
		//calling this is to print the password
		this.password=setPassword(5);
		System.out.println("\n your password is:"+this.password);
		
		
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+company;
		//System.out.println("\n Your new email:"+firstName+lastName+"@"+this.department+"llc.com");
		System.out.println("\n Your email:"+email);
	}
	
	
	
	//dept method for selecting the depttype
	public String setDepartment()
	{
		System.out.println("\n Enter the department:\n 1.sales\n 2.Account\n 3.Devlopment\n 4.None");
		Scanner sc =new Scanner(System.in);
		int depnum=sc.nextInt();
		if(depnum==1) {return "sales";}
		else if(depnum==2) {return "Account";}
		else if(depnum==3) {return "Devlopment";}
		else if(depnum==4) {return " ";}
		return null;
		
	}
	
	//pass method to generate random password
	public String setPassword(int length)

	{
		String password="QWERTYUIOPASDFGHJKLZXCVBNM12345678!@#$%^&*";
		char[] pass=new char[length];
		for(int i=0;i<length;i++)
		{
			int val=(int)(Math.random()*password.length());
			pass[i]=password.charAt(val);
			
		}
		return new String(pass);
		
		
	}



	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}



	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}



	public String getAlternateEmail() {
		return alternateEmail;
	}



	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	@Override
	public String toString() {
		return "Email [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", department="
				+ department + ", mailBoxCapacity=" + mailBoxCapacity + ", alternateEmail=" + alternateEmail
				+ ", email=" + email + ", company=" + company + "]";
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

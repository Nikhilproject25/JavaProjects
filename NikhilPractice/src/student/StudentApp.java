package student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {
	
	private String[] course;
	private String students;
	private int gradYear;
	private String studentId;
	private int gradLevel;
	private String gradinfo;
	private String firstName;
	private String lastName;
	private int totalcourses;
	private int courseFee=600;
	private static int id=44444;
	private String[] allcourse;
	//private int noofUsers;
	
	
	
	Scanner sc=new Scanner(System.in);
	//enter how many students are going to register
	public StudentApp()
	{
		
		
		
		System.out.println("Enter user firstName");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter user lastName");
		this.lastName=sc.nextLine();
		
		System.out.println("Enter the year of Joining");
		this.gradYear=sc.nextInt();
		
		this.gradinfo=setGradLevel();
		this.allcourse=setStudentCourse();
		setStudentId();
		this.courseFee=setprice();
		
		System.out.println("Student1:"+" "+firstName+" "+lastName+" "+gradYear+" "+gradinfo+" "+studentId+" "+Arrays.toString(allcourse)+" "+courseFee);
		
	}
	
	public String setGradLevel()
	{
		System.out.println("Choose gradLevel \n1.Junior \n2.Senoior \n3.SuperSenior");
		gradLevel=sc.nextInt();
		if(gradLevel==1) {return "Junior";}
		else if(gradLevel==2) {return "Senior";}
		else if(gradLevel==3) {return "SuperSenior";}
		return null;	
	}
	
	public String setStudentId()
	{
		id++;
		return this.studentId=gradYear+""+id;
	
	}
	
	public String[] setStudentCourse()
	{
		System.out.println("Enter the number of course whant to register");
		totalcourses=sc.nextInt();
		
		allcourse=new String[totalcourses];
		System.out.println("Register for course \n1.History 101 \n2.Maths 101 \n3.English 101 \n4.Computer Science 101 \n5.Chemistry 101");
		
		for(int i=0;i<totalcourses;i++)
		{
			
			int course=sc.nextInt();

			
		
				if(course==1) {allcourse[i]="History";}
				else if(course==2) {allcourse[i]="Maths";}
				else if(course==3) {allcourse[i]= "English";}
				else if(course==4) {allcourse[i]= "ComputerScience"; }
				else if (course==5){allcourse[i]= "Chemistry";}
				
		}
		
		return allcourse;
	}
	
	public int setprice()
	{
		this.courseFee=totalcourses*this.courseFee;
		return courseFee;
	}

	@Override
	public String toString() {
		return "StudentApp [course=" + Arrays.toString(course) + ", students=" + students + ", gradYear=" + gradYear
				+ ", studentId=" + studentId + ", gradLevel=" + gradLevel + ", gradinfo=" + gradinfo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", totalcourses=" + totalcourses + ", courseFee=" + courseFee
				+ ", allcourse=" + Arrays.toString(allcourse) + ", sc=" + sc + "]";
	}
	
	

}

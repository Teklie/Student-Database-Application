package chalmers.se;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int classYear;
	private String courses;
	private int tuitionFee;
	private static int courseCost=400;
	private  String studentId;
	private static int id=1000;
	//constructor: prompt user to input student's name and year
	public Student() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter student's first name:\n");
		this.firstName = in.nextLine();
		System.out.println("Enter student's last name:\n");
		this.lastName = in.nextLine();
		System.out.println("Enter student's class year:\n1.First year \n2. second year \n3. third year");
		this.classYear = in.nextInt();
		this.studentId=generateStudentId();
		System.out.println(firstName+" "+lastName+" "+classYear+" "+studentId);
		
	}
	//Generate id
	private String generateStudentId() {
		id++;
		//class year + static id
		return classYear +""+id;
		
	}
	// Enroll in courses
	//View balance
	// Pay tuition
	//Show status
}

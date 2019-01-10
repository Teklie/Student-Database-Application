package chalmers.se;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int classYear;
	private int studentId;
	private String courses;
	private int tuitionFee;
	private int courseCost=400;
	//constructor: prompt user to input student's name and year
	public Student() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter student's first name:\n");
		this.firstName = in.nextLine();
		System.out.println("Enter student's last name:\n");
		this.lastName = in.nextLine();
		System.out.println("Enter student's class year:\n1.First year \n2. second year \n3. third year");
		this.classYear = in.nextInt();
		System.out.println(firstName+" "+lastName+" "+classYear);
	}
	//Generate id
	// Enroll in courses
	//View balance
	// Pay tuition
	//Show status
}

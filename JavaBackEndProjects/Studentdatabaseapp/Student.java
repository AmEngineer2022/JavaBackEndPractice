package Studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeLevel;
	private String studentID;
	private String courses;
	private static int tuitionBalance=0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter students name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();
	
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nENter student class level:");
		this.gradeLevel = in.nextInt();
		System.out.println(firstName +" "+ lastName +" " + gradeLevel);
		setStudentID();
		System.out.println(firstName+" "+lastName+" "+gradeLevel+" "+studentID);
		
	}
		
		// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeLevel +""+ id;
	}
	
	public String getStudentID() {
		return this.studentID;
	}
		
		// Enroll in courses
	public void enroll() {
		
		do {
		System.out.print("Enter course to enroll (Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = course + "\n" + courses;
			tuitionBalance = tuitionBalance + costOfCourse;
		}else {
		    break;	
		}
		} while(1 !=0);
		
		System.out.println("ENROLLED IN: \n" + courses);
		System.out.println("TUITION BALANCE: $" + tuitionBalance);
	}
	
		

	public void viewBalance() {
		System.out.println("Your balance is: $"+tuitionBalance);
	}
			
		// Pay tuition
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $ ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your pament of $"+payment);
		viewBalance();
		
	}
		
		// Show status
		
	public String showInfo() {
		return "First name: "+ firstName + " "+ lastName+"StudentID: " +studentID+"\nCourses enrolled:\n "+courses+"\nView balance: "+tuitionBalance;
	}
	
	
}

package Studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i!=2;) {
		System.out.println("Enter your choice:\n1. Register New Student.\n2. Exit.");
		i = in.nextInt();
	
		/* if( i == 1) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfo());
		}
		}*/
	//Ask for the number of students
		System.out.println("Enter number of new students to enroll:");
		int studentsNumber = in.nextInt();
		Student[] students = new Student[studentsNumber-1];
		
	//Create n number of new students
		for(int n = 0; n < studentsNumber; n++) {
		students[n] = new Student();
		students[n].enroll();
		students[n].payTuition();
		}
		
		for(int n = 0; n<studentsNumber; n++) {
		System.out.println(students[n].toString());
		}

}
	}
	}


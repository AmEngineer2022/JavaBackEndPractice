package emailapp;

import java.util.Scanner;

public class emailapp {
	
	public static void main(String[] args) {
		System.out.println("Enter your first name:");
		 Scanner in = new Scanner(System.in);
		 String firstName = in.next();
		 System.out.println("Enter your last name:");
		 String lastName = in.next();
		 email em1 = new email(firstName, lastName);
		 System.out.println(em1.showInfo());
	}

}

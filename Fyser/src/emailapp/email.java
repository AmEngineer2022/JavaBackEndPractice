

package emailapp;

import java.util.Scanner;

public class email {
 private String firstName;
 private String lastName;
 private String password;
 private String department;
 private String company;
 private int mailBoxCapacity;
 private String email;
 private String companySuffix = "company.com";
 private String alternateEmail;
 private int defaultPasswordLength =10;
  
 
 //Constructor to receive the first name and last name
 
 public email(String firstName, String lastName) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 //System.out.println("Email created: " + firstName + " " + lastName);
	 this.department= setDepartment();
	 //System.out.println("Department is: "+ department);
	 this.password = randomPassword(defaultPasswordLength);
	 //System.out.println("Your password is: " + password);
	 email = firstName + "." + lastName + "@" + department + "."+ companySuffix;
	 System.out.println(email);
 }
 
 //Ask for the department
 
 private String setDepartment() {
	 System.out.println("\n DEPARTMENT CODE:\n 1 for Sales\n 2 for Dvelopment\n 3 for Accounting\n 0 for none\n Enter department code:");
	 Scanner in = new Scanner(System.in);
	 int deptChoice = in.nextInt();
	 if (deptChoice == 1) {return "Sales";}
	 else if(deptChoice == 2) {return "Dev";}
	 else if(deptChoice == 3) {return "Acct";}
	 else return ("");
 }
 
 //Generate a random password
 
 private String  randomPassword(int length) {
	 String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
	 char[] password = new char[length];
	 for(int i = 0; i<length; i++) {
		 int rand = (int)(Math.random() * passwordSet.length());
		 password[i] = passwordSet.charAt(rand);
		// System.out.println(rand);
		// System.out.println(passwordSet.charAt(rand));
	 }
	 
	 return new String(password); 
 }
 

 //Set the mailbox capacity
 
 public void setMailBoxCapacity(int capacity) {
	 this.mailBoxCapacity=capacity;
 }
 
 //Set the alternate email
 
 public void setAlternateEmail(String altEmail) {
	 this.alternateEmail =altEmail;
 }
 
//Change the password
 
 public void changePassword(String password) {
	 this.password= password;
 }
 
 //Create getters
 
 public String getPassword() {
	 return password;
 }
 
 public int getMailBoxCapacity() {
	 return mailBoxCapacity;
 }
 
 public String getAlternateEmil() {
	 return alternateEmail;
 }
 
 //Display information
 
 public String showInfo() {
	 return "\nDisplay name:" +firstName+" " +lastName +
			 "\nCompany email:" + email + 
			 "\nMailbox capacity:" + mailBoxCapacity + "mb";
			 
 }
 
}

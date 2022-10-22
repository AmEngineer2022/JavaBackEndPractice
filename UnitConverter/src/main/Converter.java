package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int menuSelection = 0;
		while(menuSelection != 4){
			System.out.println("\n" +"Please select an option:" +"\n" 
		                      +"\n" +"1. Weight" +"\n"
							  +"\n" +"2. Distance" +"\n"
							  +"\n" +"3. Volume" +"\n"
							  +"\n" +"4. Quit");
			
		menuSelection = scanner.nextInt();
		
		
		switch(menuSelection) {
		case 1:Weight(scanner);
		break;
		case 2:Distance(scanner);
		break;
		case 3:Volume(scanner);
		break;
		case 4:{for(int i= 0; i<30;i++ )
			System.out.println("");}
		break;
		}
		}
		}		
		
	public static Double Weight(Scanner scanner) {
		double result=0;
		System.out.println("Please select an option:" +"\n\n"
				         + "1. Ouces to Pounds" +"\n\n"
			             + "2. Pound to Kilogram" +"\n"	);
		int option = scanner.nextInt();
		switch(option) {
		case 1: 
		    double x = input(scanner);
		    x =x/16;
		    System.out.println("Value in Pounds is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 2:
		    x =input(scanner);
			x = x/2.205;
		    System.out.println("Value in Pounds is:" + x);	
		    System.out.println("Press 1 to go back to the main menu.");
		    x = scanner.nextInt();
		break;   
			
		}
		return result;
		
	}
	
	
	public static Double Distance(Scanner scanner) {
		double result=0;
		System.out.println("Please select an option:" +"\n\n"
				         + "1. Miles to Kilometers" +"\n\n"
			             + "2. Kilometers to Miles" +"\n\n"	
				         + "3. Yards to feet" +"\n\n"
			             + "4. Feet to Yard" +"\n");
		int option = scanner.nextInt();
		switch(option) {
		case 1: 
		    double x = input(scanner);
		    x =x * 1.6;
		    System.out.println("Value in Kilometers is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 2: 
		    x = input(scanner);
		    x =x / 1.6;
		    System.out.println("Value in Miles is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 3: 
		    x = input(scanner);
		    x =x * 3;
		    System.out.println("Value in foot is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 4: 
		    double x = input(scanner);
		    x =x / 3;
		    System.out.println("Value in Yard is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		return result;
	}
	
	public static Double Volume(Scanner scanner) {
		double result=0;
		System.out.println("Please select an option:" +"\n\n"
				         + "1. Cup to Gallon" +"\n\n"
			             + "2. Gallon to Cup" +"\n\n"	
				         + "3. Pint to Quart" +"\n\n"
			             + "4. Quart to Pint" +"\n");
		int option = scanner.nextInt();
		switch(option) {
		case 1: 
		    double x = input(scanner);
		    x =x * 16;
		    System.out.println("Value in Gallons is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 2: 
		    x = input(scanner);
		    x =x * 16;
		    System.out.println("Value in Cups is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 3: 
		    x = input(scanner);
		    x =x / 2;
		    System.out.println("Value in Quart is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		case 4: 
		    x = input(scanner);
		    x =x * 2;
		    System.out.println("Value in Pint is:" + x);	
		    System.out.println("Press 1 to go back to main menu.");
		    x = scanner.nextInt();
		break;
		}
		return result;
		
	}
	
	public static Double Time(Scanner scanner) {
		double result=0;
		return result;
	
	}
	
	public static Double input (Scanner scanner) {
		System.out.println("Enter value to be converted:");
		double input = scanner.nextDouble();
		return input;
		
		
	}
	
}
		
	



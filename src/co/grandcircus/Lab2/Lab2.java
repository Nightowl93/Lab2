package co.grandcircus.Lab2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		//Declares variables and creates scanner
		Scanner scnr = new Scanner(System.in);
		double length;
		double width;
		double height;
		String classroom;
		double area;
		double perimeter;
		double volume;
		String keepGoing;
		Boolean response = true;
		
		//Welcome message to user
		System.out.println("Let's calculate Grand Circus room dimensions!");
		
		//Only runs when user chooses to continue
		while (response == true) {

			//Prompts user for the necessary questions to solve for room area, volume, and perimeter
			System.out.println("Which classroom are you in? ");
			classroom = scnr.nextLine();
			
			System.out.println("Please enter the length of the classroom: ");
			length = scnr.nextDouble();
			
			System.out.println("Please enter the width of the classroom: ");
			width = scnr.nextDouble();
			
			System.out.println("Please enter the height of the classroom: ");
			height = scnr.nextDouble();
			
			//Calculates and assigns the area, volume, and perimeter to appropriate variables
			area = length * width;
			perimeter = 2 * (length + width);
			volume = length * width * height;
			
			//Prints out the calculated values
			System.out.println("The area of the " + classroom + " classroom is " + area);
			System.out.println("The perimeter of the " + classroom + " classroom is " + perimeter);
			System.out.println("The volume of the " + classroom + " classroom is " + volume);
			
			//When loop reiterates, this ensures this question will not be skipped over. 
			scnr.nextLine();
			
			//Prompts user to continue or not
			System.out.println("Would you like to continue? (y/n) ");
			keepGoing = scnr.nextLine();
			
			//If user continues, ensures loop reiterates
			if (keepGoing.charAt(0) == 'y' || keepGoing.charAt(0) == 'Y')
			{
				response = true;
			}
			
			//If user does not wish to continue, ensures loop does not reiterate and tells user goodbye
			else {
				response = false;
				System.out.println("Thank you and Goodbye!");
		}
		}
		
			
	}

}
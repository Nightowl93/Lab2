package co.grandcircus.Lab2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
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
		
		System.out.println("Let's calculate Grand Circus room dimensions!");
		
		while (response == true) {

			System.out.println("Which classroom are you in? ");
			classroom = scnr.nextLine();
			
			System.out.println("Please enter the length of the classroom: ");
			length = scnr.nextDouble();
			
			System.out.println("Please enter the width of the classroom: ");
			width = scnr.nextDouble();
			
			System.out.println("Please enter the height of the classroom: ");
			height = scnr.nextDouble();
			
			area = length * width;
			perimeter = 2 * (length + width);
			volume = length * width * height;
			
			System.out.println("The area of the " + classroom + " classroom is " + area);
			System.out.println("The perimeter of the " + classroom + " classroom is " + perimeter);
			System.out.println("The volume of the " + classroom + " classroom is " + volume);
			
			//When loop reiterates, this ensures this question will not be skipped over. Debugged.
			scnr.nextLine();
			System.out.println("Would you like to continue? (y/n) ");
			keepGoing = scnr.nextLine();
			
			if (keepGoing.charAt(0) == 'y' || keepGoing.charAt(0) == 'Y')
			{
				response = true;
			}
			
			else {
				response = false;
				System.out.println("Thank you and Goodbye!");
		}
		}
		
			
	}

}


//Area = lw
//perimeter = 2 (l+w) 
//volume = lwh
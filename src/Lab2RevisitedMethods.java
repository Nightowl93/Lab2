import java.util.Scanner;

public class Lab2RevisitedMethods {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double roomWidth, roomLength;
		
		System.out.println("Enter the width of the room.");
		roomWidth = scnr.nextDouble();
		System.out.println("Enter the length of the room.");
		roomLength = scnr.nextDouble();
		
		double area, perimeter;
		area = Shapes.calcArea(roomWidth, roomLength);
		perimeter = Shapes.calcPerimeter(roomWidth, roomLength);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		scnr.close();
	}
	
	
	
}


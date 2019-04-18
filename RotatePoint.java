/*
	William Leung
	307059602
	CS2011-4
*/

import java.util.Scanner;
public class RotatePoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x- and y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2;
		double y2;
		System.out.print("Enter angle of rotation in degrees: ");
		double angle = input.nextDouble();
		angle = Math.toRadians(angle);
		System.out.print("Enter '+' for counter-clockwise \n" +
			" or '-' for clockwise rotation: ");
		char directionOfRotation = input.next().charAt(0);
		if (directionOfRotation == '+') {
			x2 = Math.rint(((x1 * Math.cos(angle)) - (y1 * Math.sin(angle)))*100)/100;
			y2 = Math.rint(((x1 * Math.sin(angle)) + (y1 * Math.cos(angle)))*100)/100;
			System.out.println("New coordinates are (" + x2 + ", " + y2 + ")");
		}
		else if (directionOfRotation == '-') {
			x2 = Math.rint(((x1 * Math.cos(angle * -1)) - (y1 * Math.sin(angle * -1)))*100)/100;
			y2 = Math.rint(((x1 * Math.sin(angle * -1)) + (y1 * Math.cos(angle * -1)))*100)/100;
			System.out.println("New coordinates are (" + x2 + ", " + y2 + ")");
		}
		else {
			System.out.println("Invalid input: " + directionOfRotation);
		}

	}
}
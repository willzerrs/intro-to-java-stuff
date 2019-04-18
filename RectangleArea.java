import java.util.Scanner;
public class RectangleArea {
	public static void main(String[] args) {
		System.out.print("Enter rectangle width and height: ");
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
		double length = input.nextDouble();
		if (width >= 0 && length >= 0) {
			double area = width * length;
			System.out.println("The area is " + area);
		}
		else {
			System.out.println("Invalid input.");
		}
		input.close();
	}
}
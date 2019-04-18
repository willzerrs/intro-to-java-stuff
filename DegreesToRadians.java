import java.util.Scanner;

public class DegreesToRadians{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Degrees: ");
		double degrees = input.nextDouble();

		double radians = degrees * Math.PI / 180;

		System.out.print("Radians: " + radians);
	}
}
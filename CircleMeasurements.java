import java.util.Scanner;

public class CircleMeasurements {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");


		double radius = input.nextDouble(); //One way of creating a variable
		final double PI = 3.141519; //Or you can separate them by creating another line
		System.out.println("Diameter is " + radius * 2);
		System.out.println("Perimeter is " + 2 * PI + radius);
		System.out.println("Area is " + PI * radius * radius);
		System.out.println(5.0 / 2 * 2);
		System.out.println(2 * 5 / 2);
/*)
		int a = 1, b = 1;
		int c1 = 10 + ++a * 10;
		int c2 = 10 + b++ * 10;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c1 is " + c1);
		System.out.println("c2 is " + c2);

		//calculating numbers to a power of n
		//use Math.pow(x,n)
		System.out.println(Math.pow(2,3));
		System.out.println(Math.pow(3,2));*/
	}
}
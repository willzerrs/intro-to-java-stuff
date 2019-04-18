import java.util.Scanner;
public class Divisible {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter divdiend: ");
		int dividend = input.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = input.nextInt();
		input.close();

		if (divisor == 0) {
			System.out.println("Are you trying to break me?");
		}
		else if (divisor == 1) {
			System.out.println("Everything is divisible by " + divisor + "!");
		}
		else if (dividend == 1) {
			System.out.println(dividend + " is divisible by everything!");
		}
		else if (dividend % divisor == 0) {
			System.out.println("Yes, " + divisor + " will divide " + dividend + " evenly");
		}
		else {
			System.out.println("No, " + dividend + " is not divisible by " + divisor);
		}
	}
}
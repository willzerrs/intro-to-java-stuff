import java.util.Scanner;
public class Mortgage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter price in thousands: ");
		double price = input.nextDouble() * 1000;

		System.out.println("What percent of that will you put down?");
		double downpayment = input.nextDouble() / 100 * price;

		System.out.println("Downpayment amount is " + downpayment);

		System.out.println("Enter number of years: ");
		int years = input.nextInt();

		System.out.print("Enter annual interest rate: ");
		double rate = input.nextDouble();


		//principle amount
		double p = price - downpayment;
		double r = rate / 100 / 12;
		int n = years * 12;

		double monthlyPayment = (r * p * Math.pow(1 + r, n)) / (Math.pow(1 + r, n)-1);
		System.out.println("Your monthly payment is: " + (int) monthlyPayment);
		input.close();
	}
}
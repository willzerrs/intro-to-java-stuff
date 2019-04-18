import java.util.Scanner;

public class WeightedAvg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three number and weight pairs: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double average = ((a*b)+(c*d)+(e*f)) / (b+d+f);

		System.out.println("The weighted average is " + average);
	}
}
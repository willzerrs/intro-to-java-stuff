/*
	William Leung
	307059602
	CS2011-4
	Asks user for how many dices to be rolled. Simulates dice rolled and displays results.
*/
import java.util.Scanner;
public class NDice{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many dice would you like to roll? ");
		int rolls = input.nextInt();
		input.close();
		int number = 0;
		int b = 1;
		double i = 0;
		if (rolls < 0) {
			System.out.println("Please enter a non-negative number.");
			return;
		}
		while(rolls > 0){
			b = b * 10;
			rolls--;
			i++;
		}
		System.out.print("dice rolled: ");
		for (; i > 0 ; i--) {
			int a = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			System.out.print(a + " ");
			a = a * b;
			b = b / 10;
			number = number + a;
			Math.round(number);
		}
		number = number / 10;
		System.out.println("\ngenerated number: " + number);
	}
}
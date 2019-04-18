/*
	William Leung
	307059602
	CS2011-4
	Requests for a integer and a character from the user. Returns a square the size of the integer
	and formed by the character.
*/
import java.util.Scanner;
public class SquarePattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer and a character: ");
		int num = in.nextInt();
		char letter = in.next().charAt(0);
		displayPattern(num, letter);
	}
	public static void displayPattern(int n, char c) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
/*
	William Leung
	307059602
	CS2011-4
	Requests for a range of integer and returns perfect squares between the range.
*/
import java.util.Scanner;
public class PerfectSquares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range: ");
		int first = in.nextInt();
		int second = in.nextInt();
		if (second < first) {
			System.out.println("Invalid range.");
			return;
		}
		System.out.println();
		printSquaresInRange(first, second);
	}
	public static void printSquaresInRange(int i1, int i2){
		for (; i1 <= i2 ; i1++ ) {
			isPerfectSquare(i1);
		}
	}
	public static boolean isPerfectSquare(int i1) {
		if (i1 == 0) {
			System.out.print("0 ");
		}
		if (i1 % Math.sqrt(i1) == 0){
			System.out.print(i1 + " ");
			return true;
		}
		else {
			return false;
		}
	}
}
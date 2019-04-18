/*
	William Leung
	307059602
	CS2011-4
	Variation on FiveDice. Simulates rolling five dices and displays the five digits.
*/
public class FiveDice2{
	public static void main(String[] args) {
		int number = 0;
		int b = 10000;
		System.out.print("dice rolled: ");
		for (int i = 0; i < 5 ; i++) {
			int a = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			System.out.print(a + " ");
			a = a * b;
			b = b / 10;
			number = number + a;
		}
		System.out.println("\ngenerated number: " + number);
	}
}
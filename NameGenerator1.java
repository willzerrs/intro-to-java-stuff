/*
	William Leung
	307059602
	CS2011-4
	Variation of NameGenerator. Requests user to input length of name.
*/
import java.util.Scanner;
public class NameGenerator1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name length: ");
		int i = input.nextInt();
		if (i < 1) {
			System.out.println("The length must at least be 1.");
			return;
		}
		else if (i == 1) {
				int a = (int)(65 + Math.random() * (90 - 65 + 1));
				System.out.print((char)a);
		}
		for (int j = 0; j < i - 1; j++ ) {
			if (j == 0) {
				int a = (int)(65 + Math.random() * (90 - 65 + 1));
				System.out.print((char)a);
			}
			int b = (int)(97 + Math.random() * (122 - 97 + 1));
			System.out.print((char)b);
		}
	}
}

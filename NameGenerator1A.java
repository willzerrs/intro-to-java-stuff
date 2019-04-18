/*
	William Leung
	307059602
	CS2011-4
	Variation of NameGenerator1. Responds with the satisfaction of the name.
*/
import java.util.Scanner;
import java.util.Random;
public class NameGenerator1A{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("Enter name length: ");
		int i = input.nextInt();
		String name = "";
		if (i < 1) {
			System.out.println("The length must at least be 1.");
			return;
		}
		else if (i == 1) {
			int a = (int)(65 + Math.random() * (90 - 65 + 1));
			name = "" + (char)a;
			System.out.print((char)a);
		}
		for (int j = 0; j < i - 1 ; j++ ) {
			int d = 1;
			if (j == 0) {
				int c = (int)(65 + Math.random() * (90 - 65 + 1));
				System.out.print((char)c);
				d = c;
			}
			int b = (int)(97 + Math.random() * (122 - 97 + 1));
			System.out.print((char)b);
			name = "" + name + (char)(d) + (char)(b);
		}
		int satisfaction = (int)(Math.random() * 11);
		if (satisfaction < 8) {
			System.out.println("Hmmmm, '" + name + "' is not my best work");
		}
		else {
			System.out.println("Hmmmm, '" + name + "' has a nice ring to it.");
		}
	}
}

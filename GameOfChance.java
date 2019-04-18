/*
	William Leung
	307059602
	CS2011-4
	A game based on rolling a virtual dice. Winner of each rounds gets the points added up from both dices
	rolled from each player.
*/
import java.util.Scanner;
public class GameOfChance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello You! Let's see which one of us");
		System.out.println("the gods of pseudorandomness favor...");
		System.out.println();
		System.out.println("Press 'Enter' whenever you are");
		System.out.println("ready to roll the virtual die.");
		String blah = in.nextLine();
		System.out.println();
		int me = 0;
		int you = 0;
		for (int round = 1; round < 10 ; round++ ) {
			System.out.println("              S C O R E");
			System.out.println("               me : you");
			System.out.println("                " + me + " : " + you);
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("               Round " + round);
			int a = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			int b = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			System.out.println("I rolled: " + a);
			System.out.print("Your turn:");
			blah = in.nextLine();
			System.out.println(b);
			System.out.println();
			if (a > b) {
				me = me + a + b;
			}
			else if (a < b) {
				you = you + a + b;
			}
			else if (a == b) {
				me = me - a - b;
				you = you - a - b;
			}
			if (round >= 3) {
				if ((me * 5) < you) {
					System.out.println("*shrug* whatever, who cares.");
					return;
				}
				else if ((you * 5) < me) {
					System.out.println("I TOTALLY earned dis.");
					return;
			}
		}
		if (round == 10) {
			System.out.println("              S C O R E");
			System.out.println("               me : you");
			System.out.println("                " + me + " : " + you);
			System.out.println();
			System.out.println("-----------------------------------------");
			if (me == you) {
				System.out.println("I still refuse to accept you as my equal.");
				return;
			}
			else if (me > you) {
				System.out.println("I TOTALLY earned dis.");
				return;
			}
			else if (you > me) {
				System.out.println("*shrug* whatever, who cares.");
				return;
			}
		}
		}
	}
}
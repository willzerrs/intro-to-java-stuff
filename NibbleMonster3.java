/*
	William Leung
	307059602
	CS2011-4
	Game variation of NibbleMonster
*/
import java.util.Scanner;
import java.util.Random;
public class NibbleMonster3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int hunger = r.nextInt(3);
		hunger += 1;
		System.out.println(":E monster hungry!!!");
		System.out.print("feed nibble :o ");
		char nibble = input.next().charAt(0);
		do {
			if (Character.isLowerCase(nibble) && nibble < 'g') {
				hunger++;
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else if (Character.isUpperCase(nibble) && nibble < 'G') {
				hunger++;
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else if (Character.isDigit(nibble) && nibble <= '9') {
				hunger++;
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else {
				hunger -= 1;
				System.out.print("barffffff! :o=" + nibble);
			}
		}while(hunger != 10 && hunger != 0);
		if (hunger == 0) {
			System.out.println("ROAAAR");
			System.out.println("Game Over: You Died.");
		}
		else if (hunger == 10) {
			System.out.println("NYAaa...zzz...");
			System.out.println("Congratulations! The monster is satisfied.");
		}
	}
}
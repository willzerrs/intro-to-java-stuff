/*
	William Leung
	307059602
	CS2011-4
	Do loop variation of NibbleMonster
*/
import java.util.Scanner;
public class NibbleMonster2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char nibble = 'a';
		do {
			if (Character.isLowerCase(nibble) && nibble < 'g') {
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else if (Character.isUpperCase(nibble) && nibble < 'G') {
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else if (Character.isDigit(nibble) && nibble <= '9') {
				System.out.println(":E monster still hungry!!!");
				System.out.print("feed nibble :o ");
				nibble = input.next().charAt(0);
			}
			else {
				System.out.print("barffffff! :o=" + nibble);
			}
		}while(Character.isUpperCase(nibble) && nibble < 'G' || Character.isLowerCase(nibble) && nibble < 'g' || Character.isDigit(nibble) && nibble <= '9');
	}
}
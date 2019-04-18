/*
	William Leung
	307059602
	CS2011-4
	While loop variation of NibbleMonster
*/
import java.util.Scanner;
public class NibbleMonster1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(":E monster hungry!!!");
		System.out.print("feed nibble :o ");
		char nibble = input.next().charAt(0);
		while (Character.isUpperCase(nibble) && nibble < 'G' || Character.isLowerCase(nibble) && nibble < 'g' || Character.isDigit(nibble) && nibble <= '9') {
			System.out.println(":E monster still hungry!!!");
			nibble = input.next().charAt(0);
		}
		System.out.println("barfffff! :o=");
	}
}
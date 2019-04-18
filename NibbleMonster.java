/*
	William Leung
	307059602
	CS2011-4
*/

import java.util.Scanner;
public class NibbleMonster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(":E monster hungry!!!");
		System.out.print("feed nibble :o ");
		char nibble = input.next().charAt(0);
		if (Character.isDigit(nibble) == true){
			System.out.println("nom nom nom");
		}
		else if (Character.isUpperCase(nibble) == true) {
			System.out.println("YUM!");
		}
		else if (Character.isLowerCase(nibble) == true) {
			System.out.println("yum!");
		}
		else {
			System.out.println("barffffff! :o=" + nibble);
		}
	}
}
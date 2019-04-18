import java.util.Scanner;

public class Parrot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Type something: ");
		String mock = input.nextLine();
		System.out.println(mock + "!");
	}
}
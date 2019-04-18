import java.util.Scanner;
public class IntToByte{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter an integer: ");
	int integer = input.nextInt();
	System.out.println("Int value: " + integer);
	byte b = (byte) integer;
	System.out.println("Byte value: " + b);
	input.close();
	}
}
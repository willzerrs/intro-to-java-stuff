import java.util.Scanner;
public class BitsToDecimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five bits: ");
		String bits = input.nextLine();
		bits = bits.replaceAll("\\s","");
		int decimal = Integer.parseInt(bits,2);
		System.out.println(bits + " in decimal is " + decimal);
		input.close();
	}
}
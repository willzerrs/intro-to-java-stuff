import java.util.Scanner;
public class MaxOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			}
			else {
				max = c;
			}
		}
		else if (b > c) {
			max = b;	
		}
		else {
			max = c;
		}
		System.out.println("max: " + max);
	}
}
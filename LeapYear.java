import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();

		String msg = " a leap year";
		if(year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
			msg = " is" + msg;
		}
		else {
			msg = " is not" + msg;

		}
		System.out.println(year + msg);
		input.close();

	}
}
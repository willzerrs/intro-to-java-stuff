import java.util.Scanner;
public class TestTutor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in the following:");
		int a = (int)(65 + Math.random() * (90 - 65 + 1));
		int b = (int)(97 + Math.random() * (122- 97 + 1));
		int c = (int)(97 + Math.random() * (122 - 97 + 1));
		int d = (int)(97 + Math.random() * (122 - 97 + 1));
		char e = (char) a;
		char f = (char) b;
		char g = (char) c;
		char h = (char) d;
		String i = "" + e + f + g + h;
		System.out.println(i);
		String j = input.next();
		if (j.equals(i)) {
			System.out.println("You got it!");
		}
		else if (j.equalsIgnoreCase(i)) {
			System.out.println("Almost right, but mind the casing next time.");
		}
		else {
			System.out.println("Wrong");
		}

	}
}
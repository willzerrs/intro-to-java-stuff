/*
	William Leung
	307059602
	CS2011-4
	Simulates rolling five dices.
*/
public class FiveDice{
	public static void main(String[] args) {
		for (int i = 1; i < 6 ; i++) {
			String dice = "";
			int a = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			int b = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			int c = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			int d = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			int e = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			switch (i) {
				case 1:
					dice = "First die is ";
					System.out.println(dice + a);
					break;
				case 2:
					dice = "Second die is ";
					System.out.println(dice + b);
					break;
				case 3:
					dice = "Third die is ";
					System.out.println(dice + c);
					break;
				case 4:
					dice = "Fourth die is ";
					System.out.println(dice + d);
					break;
				case 5: 
					dice = "Fifth die is ";
					System.out.println(dice + e);
					break;
				default:
					break;
			}
		}
	}
}
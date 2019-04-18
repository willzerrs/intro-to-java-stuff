/*
	William Leung
	307059602
	CS2011-4
	Variation of FiveDice. Simulates rolling five dices and prints out an ASCII representation of a dice.
*/
public class FiveDice1{
	public static void main(String[] args) {
		for (int i = 1; i < 7 ; i++) {
			String dice = "";
			int a = (int)(Math.random() * ((6 - 1) + 1)) + 1;
			switch (a) {
				case 1:
					dice = 
					  "+-------+\n"
					+ "|       |\n"
           			+ "|   *   |\n"
            		+ "|       |\n"
            		+ "+-------+";
            		System.out.println(dice);
					break;
				case 2:
					dice = 
					  "+-------+\n"
					+ "|   *   |\n"
           			+ "|       |\n"
            		+ "|   *   |\n"
            		+ "+-------+";
            		System.out.println(dice);
					break;
				case 3:
					dice = 
					  "+-------+\n"
					+ "|   *   |\n"
           			+ "|   *   |\n"
            		+ "|   *   |\n"
            		+ "+-------+";
            		System.out.println(dice);
					break;
				case 4:
					dice = 
					  "+-------+\n"
					+ "| *   * |\n"
           			+ "|       |\n"
            		+ "| *   * |\n"
            		+ "+-------+";
            		System.out.println(dice);
					break;
				case 5: 
					dice = 
					  "+-------+\n"
					+ "| *   * |\n"
           			+ "|   *   |\n"
            		+ "| *   * |\n"
            		+ "+-------+";
            		System.out.println(dice);
					break;
				case 6:
					dice = 
					  "+-------+\n"
					+ "| *   * |\n"
           			+ "| *   * |\n"
            		+ "| *   * |\n"
            		+ "+-------+";
            		System.out.println(dice);
				default:
					break;
			}
		}
	}
}
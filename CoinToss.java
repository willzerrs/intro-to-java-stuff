import java.util.Random;
public class CoinToss {
	public static void main(String[] args) {
		Random random = new Random();
		int bool = random.nextInt(2);
		if (bool == 1) {
			System.out.println("You got heads.");
		}
		else {
			System.out.println("You got tails.");
		}
	}
}
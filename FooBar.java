/*
	William Leung
	307059602
	CS2011-4
	Reports numbers between 1-100. Numbers divisible by 3 are given back 'Foo'.
	Numbers divisible by 5 are given back 'Bar'. If the number is divisible by both, it reports 'FooBar'.
*/
public class FooBar{
	public static void main(String[] args) {
		for (int i = 0; i <= 100 ; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FooBar");
				}
				else {
					System.out.println("Foo");
				}
			}
			else if (i % 5 == 0) {
				System.out.println("Bar");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
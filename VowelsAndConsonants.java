/*
	William Leung
	307059602
	CS2011-4
	Tests the string for vowels and consonants. Reports back the vowels and
	consonants seperately. Also returns the length of the vowels and consonants.
*/
public class VowelsAndConsonants {
	public static void main(String[] args) {
		System.out.println("Testing with String 'Arduino Uno'");
		String word = "Arduino Uno";
		System.out.println(printVowels(word));
		System.out.println(getNumVowels(word));
		System.out.println(printConsonants(word));
		System.out.println(getNumConsonants(word));
	}
	public static String printVowels(String s) {
		String vowels = "";
		for (int i = 0; i < s.length() ; i++ ) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				vowels += s.charAt(i);
			}
			if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
				vowels += s.charAt(i);
			}
			if (s.charAt(i) == 'i' || s.charAt(i) == 'I') {
				vowels += s.charAt(i);
			}
			if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {
				vowels += s.charAt(i);
			}
			if (s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				vowels += s.charAt(i);
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				vowels += s.charAt(i);
			}

		}
		return vowels;
	}
	public static int getNumVowels(String s) {
		int length = printVowels(s).length();
		return length;
	}
	public static String printConsonants(String s) {
		String consonants = "";
		for (int i = 0; i < s.length() ; i++ ) {
			if (s.charAt(i) >= 'b' && s.charAt(i) < 'e') {
				consonants += s.charAt(i);
			}
			if (s.charAt(i) >= 'f' && s.charAt(i) < 'i') {
				consonants += s.charAt(i);
			}
			if (s.charAt(i) >= 'j' && s.charAt(i) < 'o') {
				consonants += s.charAt(i);
			}
			if (s.charAt(i) >= 'p' && s.charAt(i) < 'u') {
				consonants += s.charAt(i);
			}
			if (s.charAt(i) >= 'v' && s.charAt(i) < 'y') {
				consonants += s.charAt(i);
			}
		}
		return consonants;
	}
	public static int getNumConsonants(String s) {
		int length = printConsonants(s).length();
		return length;
	}
}
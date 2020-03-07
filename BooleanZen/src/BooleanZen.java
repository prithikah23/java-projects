
import java.util.Scanner;

//declaration of class
public class BooleanZen {
	// main method
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a word to count the vowels and consonants: ");
		int vowels = 0;
		int consonants = 0;
		String S = console.next();
		// do while loop to find the number of vowels and consonants, and if it has all
		// vowels and consonants
		do {
			vowels = 0;
			consonants = 0;
			for (int i = 0; i < S.length(); i++) {
				if (isVowel(S.charAt(i))) {
					vowels++;
				} else {
					consonants++;
				}
			}
			if (notAllVowels(S)) {
				System.out.println("Your word was not all vowels!");
			} else {
				System.out.println("Your word was all vowels.");
			}
			System.out.println("Your word had " + vowels + " vowels and " + consonants + " consonants");
			System.out.println("Enter \"quit\" to quit. \n");
			System.out.print("Enter a word to count the vowels and consonants: ");
			S = console.next();
		} while (!S.equals("quit"));
		System.out.print("Done.");
	}

//method that negates and
	public static boolean negateAnd(boolean a, boolean b) {
		return (!(a && b));
	}

	// method that negates or
	public static boolean negateOr(boolean a, boolean b) {
		return (!(a || b));
	}

	// method that checks for alliteration
	public static boolean alliterates(String x, String y) {
		return (x.substring(0, 1).equalsIgnoreCase(y.substring(0, 1)));
	}

////method that check if the char is a vowel
	public static boolean isVowel(char x) {
		return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
				|| x == 'U');
	}

	// method that checks whether the string has all vowels
	public static boolean notAllVowels(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!isVowel(s.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}

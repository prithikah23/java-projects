

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		System.out.println("Please type your word and it will be translated into Pig Latin. Enter " + "q" + " to quit.");
		Scanner console = new Scanner(System.in);
		String word = console.next();
		while (!word.equals("q")) {
			String new_word=translate(word);
			System.out.println(new_word);
			word = console.next();
		}
		System.out.println("Thankyou for using the translator!");
	}

	public static String translate(String word) {
		word=word.toLowerCase();
			if (word.charAt(0) == 'a' | word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
					|| word.charAt(0) == 'u') {
				word = word + "Way";
			} else {
				word = word.substring(1) + word.substring(0, 1).toUpperCase() + "ay";
			}
			return word;	
	}
}

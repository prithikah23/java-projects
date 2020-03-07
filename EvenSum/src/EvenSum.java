
import java.util.Scanner;

//Declaration of class
public class EvenSum {

	public static void main(String[] args) {
		printsum(); // calls the print sum method
	}

	//
	public static void printsum() {
		int sum = 0;
		int n = 0;
		int max = 0;
		System.out.print("how many integers? ");
		Scanner console = new Scanner(System.in);
		int m = console.nextInt();
		// to obtain all the number the user is entering and to find even max and even
		// sum
		for (int i = 0; i < m; i++) {
			System.out.print("next integer? ");
			n = console.nextInt();
			if (n > max && n % 2 == 0) // checks for even max
				max = n;
			if (n % 2 == 0)
				sum = sum + n; // to obtain the even sum
		}
		System.out.println("even sum = " + sum);
		System.out.println("even max = " + max);

	}

}

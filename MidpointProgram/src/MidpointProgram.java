
public class MidpointProgram {

	public static void main(String[] args) {
		System.out.println(hasMidpoint(2, 1, 4));
	}

	// method that checks for checkpoint
	public static boolean hasMidpoint(int a, int b, int c) {
		return (((double) (a + b) / 2) == c || ((double) (c + b) / 2) == a || ((double) (c + a) / 2) == b);
	}
}

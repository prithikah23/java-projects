
public class PineTree {
	public static final String DOLLAR="^ _ ^";
	public static void main(String[] args) {
		drawTree(3);
	}

	public static void drawTree(int height) {
		for (int dollar = 1; dollar <= height-1; dollar++) {
			System.out.print(" ");
		}
		System.out.print(DOLLAR);
		System.out.println();
		for (int i = 1; i <= height; i++) {
			for (int line = 0; line <= i+1; line++) {
				for (int space = 1; space <= -line+4; space++) {
					System.out.print(" ");
				}
				System.out.print("/");
				for(int star = 1;  star<=line;star++) {
					System.out.print(" *");
				}
				System.out.print("\\");
				System.out.println();
			}	
		}
		for (int space = 1; space <= height; space++) {
			System.out.print(" ");
		}
		System.out.println("| |");
	}

}


public class SlashFigure3 {
	public static final int CONST = 7;

	public static void main(String[] args) {
		printSlashFigure();
	}

	public static void printSlashFigure() {
		for (int j = 1; j <= CONST; j++) { // number of lines
			for (int i = 1; i <= ((j * 2) - 2); i++) {
				System.out.print("\\");
			}
			for (int a = 1; a <= (((CONST * 4) + 2) - (j * 4)); a++) {
				System.out.print("!");
			}
			for (int b = 1; b <= ((j * 2) - 2); b++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
}


public class Testiterators {

	public static void forLoop(int ender) {
		System.out.println("for loop");
		for (int i = 0; i <= ender; i++) {
			System.out.print(i);
		}
		System.out.println("");
	}

	public static void whileLoop(int ender) {
		System.out.println("while loop");
		int i = 0;
		while (i <= ender) {
			System.out.print(i);
			i++;
		}
		System.out.println("");
	}

	public static void doWhileLoop(int ender) {
		System.out.println("do while loop");
		int i = 0;
		do {
			System.out.print(i);
			i++;
		} while (i <= ender);
	}

	public static void main(String[] args) {
		int ender = 10;
		forLoop(ender);
		whileLoop(ender);
		doWhileLoop(ender);
	}
}

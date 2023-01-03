package Pattern;

public class Star {

	public static void main(String[] args) {
		
		int n;
		pattern1(n=4);
	}
	static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {
			//for every row, run the col
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");

		}
		// when one row is printed , we need to add a newline
		System.out.println();

	}
}

}
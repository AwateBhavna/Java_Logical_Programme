package Pattern;

public class Number_Pattern {

	public static void main(String[] args) {
		int n;
		number_pat(n=5);
	}
static void number_pat(int n) {
	for (int row = 1; row <= n; row++) {
		// for every row, run the col
		for (int col = 1; col <= row; col++) {
			
		
			System.out.print(col + " ");
		}
		// when one row is printed  ,we need to add a new line
					System.out.println();
	}
}

}
public class multi {
	
	public static void main(String[] args) {
		int[][] a = {	{1,2,3,4,5},
						{6,7,8,9,20},
						{11,12,13,14,15} };

		//sumRow(n)
		//sumCol(n)
		//sumTotal
		//reberseRow(n)
		//reverseCol(n)
		//determinant()
		//	-must be square

		sumRow(a[][]);

	}

	public void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");				
			}
			System.out.println();
		}
	}

	public static int sumRow(int[][] a) {
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum += a[r][c];
				System.out.println("Sum of row" + a[r] + " = " + sum);				
			}
			System.out.println();
		}
	}
	
}
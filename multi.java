public class multi {
	
	public static void main(String[] args) {
		int[][] a = {	{1,2,3,4,5},
						{6,7,8,9,20},
						{11,12,13,14,15} };

		int[] b = {1,2,3,4,5,6};

		//sumRow(n)
		//sumCol(n)
		//sumTotal
		//reberseRow(n)
		//reverseCol(n)
		//determinant()
		//	-must be square

		print(snakeDraft(10, 3));

		print(rectangularize(b, 3, 2));

	}

	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");				
			}
			System.out.println();
		}
	}

	public static int[][] snakeDraft(int players, int rounds) {
		int pick = 1;
		int[][] draft = new int[rounds][players];
		for (int i=0; i<rounds; i++) {
			if (i % 2 == 0) {
				for (int i2=0; i2<players; i2++) {
				draft[i][i2] = pick;
				pick += 1;
				}
			} else {
				for (int i2=players-1; i2>=0; i2--) {
				draft[i][i2] = pick;
				pick += 1;
				}
			}
		}
		return draft;
	}

	public static int[][] rectangularize(int[] b, int rows, int col) {
		int bValue = 0;
		int[][] rectangularized = new int[rows][col];
		for (int i=0; i<rows; i++) {
			for (int i2=0; i2<col; i2++) {
				rectangularized[i][i2] = b[bValue];
				bValue += 1;
			}		
		}
		return rectangularized;
	}

	// public static void sumRow(int[][] a) {
	// 	int sum = 0;
	// 	for (int r=0; r<a.length; r++) {
	// 		for (int c=0; c<a[r].length; c++) {
	// 			sum += a[r][c];
	// 			System.out.println("Sum of row" + a[r] + " = " + sum);				
	// 		}
	// 		System.out.println();
	// 	}
	// 	return;
	// }

	
}
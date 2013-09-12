public class Arrays {

	public static void main(String[] args) {
		int[] data = new int[10];
		int[] dataB = new int[12];
		
		for(int i=0; i < data.length; i++) {
			data[i] = 10 - i;
		 }
		for(int i=0; i < dataB.length; i++) {
			dataB[i] = 12 - i;
		 }

		
		doubleIt(data);
		printArray(data);

		sum(data);

		twoLargest(data);

		int smallestIndex = 0;
		smallestIndex = closestToZero(data);
		System.out.println("Smallest index = " + smallestIndex);
		//return the index of the number closest to zero in the array
		
		int smashLength = 0;
		smashLength = data.length + dataB.length;
		int[] smash = new int[smashLength];
		smash(data, dataB, smash);
		printArray(smash);
		//smash, takes two arrays and returns a and b together as one array

	}

	public static void doubleIt(int[] a) {
		for (int i=0; i < a.length; i++) {
			//a[i] = a[i] * 2;
			a[i] *= 2;
		}
	}

	public static void sum(int[] a) {
		int evenSum = 0;
		int oddSum = 0;
		int sum = 0;
		for (int i=0; i < a.length; i++) {
			if (i % 2 == 0) {
				evenSum += a[i];	
			} else {
				oddSum += a[i];
			}
			sum += a[i];
		}

		System.out.println("Even indeces sum = "  + evenSum);
		System.out.println("Odd indeces sum = " + oddSum);
		System.out.println("Sum of all indeces = " + sum);
	}

	public static void twoLargest(int[] a) {
		int largest1 = 0;
		int largest2 = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i] > largest1) {
				largest1 = a[i];
			}else if(a[i] > largest2) {
				largest2 = a[i];	
			}	
		}
		System.out.println("Two largest elements = " + largest1 + " & " + largest2);
	}

	public static int closestToZero(int[] a) {
		int smallestValue = a[0];
		int smallestIndex = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i] < smallestValue) {
				smallestValue = a[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	public static void smash(int[] a, int[] b, int[] smash) {
		int smashLength = smash.length;
		for (int i = 0; i < smash.length; i++) {
			if (i < a.length) {
				smash[i] = a[i];	
			} else {
				smash[i] = b[i-a.length];
			}
		}
	}

	public static void printArray(int[] a) {
		for (int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			System.out.println();
		}
	}

	
}
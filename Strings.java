public class Strings {

	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

		// if (str.equals(s)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		//char c = 'r';
		
		// for (int i=0; i < str.length(); i++) {
		// 	System.out.println(str.charAt(i));
			
		// }

		// for (int i=0; i < str.length()-1; i++) {
		// 	System.out.println(str.substring(i, i+2));			
		// }

		//if (contains("baseball", "ball")) {
		//	System.out.println("Yes");
		//} else {
		//	System.out.println("No");
		//}

		//System.out.println(count("people", "e"));

		//if (hasAnA("David")) {
		//	System.out.println("There is an A");
		//} else {
		//	System.out.println("Doesn't have an A");
		//}

		// if (isPalindrome("")) {
		// 	System.out.println("Is a palindrome");
		// } else {
		// 	System.out.println("Isn't a palindrome");
		// }
		
		if (isAbecedarian("abcxz")) {
			System.out.println("Is abecedarian");
		} else {
			System.out.println("Isn't abecedarian");
		}
	}

	public static int count(String s, String t) {
		int count = 0;
		for (int i=0; i < s.length(); i++) {
			if (t.equals(s.substring(i, i+1))) {
				count += 1;				
			}
		}

		return count;
	}

	public static boolean hasAnA(String s) {
		String a = "a";
		for (int i=0; i < s.length(); i++) {
			if ((a.substring(0, 1)).equals(s.substring(i, i+1))) {
				return true;
			}
		}
		return false;
	}

	// public static boolean isPalindrome(String s) {
	// 	for (int i=0; i < s.length(); i++) {
	// 		if ((s.substring(i)).equals(s.substring((s.length()-i-1)))) {
	// 			return true;
	// 		}
	// 	}

	// 	return false;
	//}
	
	public static boolean isAbecedarian(String s) {
		for (int i=0; s.charAt(i) < s.charAt(i+1); i++) {
			if (i == s.length()-1) {
				return true;
			}
				
		}
		return false;
	}

	public static boolean contains(String s, String t) {
		for (int i=0; i <= s.length()-t.length(); i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				return true;	
			}	
		}

		return false;
	}
	
}
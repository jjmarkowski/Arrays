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

		if (isAbecedarian("abcdefa")) {
			System.out.println("Is abecedarian");
		} else {
			System.out.println("Isn't abecedarian");
		}

		if (isDupledrome("aabbzzdd")) {
			System.out.println("Is a dupledrome");
		} else {
			System.out.println("Isn't a dupledrome");
		}

		String captainCrunchString = captainCrunch("abcd ABCD", 13);
		System.out.println(captainCrunchString);
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

	public static boolean isAbecedarian(String s) {
		for (int i=0; i < s.length()-1; i++) {
			if (s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDupledrome(String s) {
		for (int i=0; i < s.length(); i+=2) {
			if (s.length() % 2 != 0 ) {
				return false;
			} else {
				if (s.charAt(i) != s.charAt(i+1)) {
					return false;
				}
			}
		}
		return true;
	}

	public static String captainCrunch(String s, int addTo) {
		//s.replace(s.charAt(1), s.charAt(1+1));
		//for (int i=0; i < s.length()-1; i++) {

			//if ((s.charAt(i) >= 65 && s.charAt(i) <= 77) || (s.charAt(i) >= 97 && s.charAt(i) <= 109)) {
			//	s.replace(s.charAt(i), s.charAt(i+1));
			//} 
		//}
		return s;
		
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
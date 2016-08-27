
public class DataStructures7 {// an initial attempt at an anagram detector algorithm

	public static void main(String[] args) {
		String one = "oso";
		String two = "oos";
		String three = "gabriel";
		String four = "leirbag";
		String five = "yyy";
		String six = "yy";
		String seven = "sisisi";
		String eight = "isisis";
		String nine = "The Best Things in Life are Free";
		String ten = "Nail biting refreshes the feet";
		String eleven = "Nail-biting refreshes the feet";
		System.out.println(isAnagram(one,two));
		System.out.println(isAnagram(three,four));
		System.out.println(isAnagram(five,six));
		System.out.println(isAnagram(seven,eight));
		System.out.println(isAnagram(five,one));
		System.out.println(isAnagram(six,eight));
		System.out.println(isAnagram(two,eight));
		System.out.println(isAnagram(nine,ten));
		System.out.println(isAnagram(nine,eleven));
	}
	
	public static boolean isAnagram (String a, String b) {
		char[] aSplit = a.replaceAll("\\s","").toLowerCase().toCharArray();
		char[] bSplit = b.replaceAll("\\s","").toLowerCase().toCharArray();// converts strings to character arrays
		if (aSplit.length != bSplit.length) {// if length not equal, immediately false
			return false;
		} else {
			// each character from first word is compared to the second, and if an equal character is found, the second word's corresponding letter is turned into a number and a boolean is activated
			for (int i = 0; i < aSplit.length; i++) {
				boolean foundMatchingLetter = false;
				for (int j = 0; j < bSplit.length; j++) {
					if (aSplit[i] == bSplit[j]) {
						if (foundMatchingLetter == false) {
							foundMatchingLetter = true;
							bSplit[j] = "0".toCharArray()[0];
							break;
						}
					}
				}
				if (foundMatchingLetter != true) {
					return false;
				}
			}
			return true;
		}// this algorithm currently runs in the worst case scenario ~ 3n + 3m + 1 + n*(4)*m(6) ~ 24*n*m + 3(n+m) + 1 ~ O(n^2) if n~m
	}

}

// 2 for loops O(n^2) = quadratic
package exercise22_03;

import java.util.Scanner;

public class Exercise22_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter String 1 ");
		String string1 = input.nextLine();
		System.out.println("Please Enter String 2 ");
		String string2 = input.nextLine();
	
	 boolean isAsubstring = isAsubstring(string1, string2);
		if(isAsubstring) {
			System.out.println("The second string is a substring of the first. ");
		} else {
			System.out.println("The second string is not a substring");
		}	
	}

	private static boolean isAsubstring(String string1, String string2) {
		if(string2.length() > string1.length()) {
			return false;
		}
		for (int i = 0; i <= string1.length() - string2.length(); i++) {
			boolean isAmatch = true;
		for (int j = 0; j < string2.length(); j++) {
			if (string1.charAt(i + j) != string2.charAt(j)) {
				isAmatch = false;
				break;
			}
		}
		if (isAmatch) {
			return true;
		}
	}
				return false;
	}
}

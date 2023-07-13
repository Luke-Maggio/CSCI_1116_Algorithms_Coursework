//1 for loop O(n) = Linear

package exercise22_1;

import java.util.Scanner;

public class Exercise22_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please Enter a String: ");
		String string1 = input.next();
		
		String maxSubstring = getMaxSubstring(string1);
		System.out.println("The max consecutive substring is " + maxSubstring);
		
	}

	
	private static String getMaxSubstring(String str) {
		if(str.isEmpty()) {
			
			return str;
	}
	
	StringBuilder maxSubstring = new StringBuilder();
	StringBuilder currentSubstring = new StringBuilder(String.valueOf(str.charAt(0)));
	
	for (int i = 1; i < str.length(); i++) {
		char currentChar = str.charAt(i);
		if (currentChar >= str.charAt(i - 1)) {
			
			currentSubstring.append(currentChar);
		} else { 
			if (currentSubstring.length() > maxSubstring.length()) {
				maxSubstring = new StringBuilder(currentSubstring);
			}
			currentSubstring = new StringBuilder(String.valueOf(currentChar));
		}
	}
	
			if (currentSubstring.length() > maxSubstring.length()) {
				maxSubstring = new StringBuilder(currentSubstring);
			}
			return maxSubstring.toString();
			}
		}
	



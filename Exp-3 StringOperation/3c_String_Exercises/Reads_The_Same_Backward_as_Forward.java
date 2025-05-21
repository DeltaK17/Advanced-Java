/*
4.Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():
*/
package Lab3;

public class Reads_The_Same_Backward_as_Forward {
	 public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
	    }

	    public static void main(String[] args) {
	        String input = "A man, a plan, a canal: Panama";
	        System.out.println("Is palindrome: " + isPalindrome(input));
	    }
}

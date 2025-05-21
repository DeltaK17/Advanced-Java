/*
1.Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
*/
package Lab3;

public class String_Contains_Whitespace {
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String input = "hello world";
	        System.out.println("Is null or empty: " + isNullOrEmpty(input));
	    }
	}


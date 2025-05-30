/*
8.Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
*/
package Lab3;

public class String_Contains_Only_Numeric_Characters {
	public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric: " + isNumeric(input));
    }
}

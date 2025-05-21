/*
5.Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
*/
package Lab3;

public class Eliminating_all_Whitespace_Characters {
	public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = " Java   Programming ";
        System.out.println("Without whitespace: " + removeWhitespace(input));
    }
}

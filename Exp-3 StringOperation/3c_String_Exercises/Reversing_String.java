package Lab3;

public class Reversing_String {
	public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverseString(input));
    }
}

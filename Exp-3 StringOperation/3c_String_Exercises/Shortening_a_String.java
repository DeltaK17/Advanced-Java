package Lab3;

public class Shortening_a_String {
	public static String truncate(String str, int length) {
        return str.length() > length ? str.substring(0, length) + "..." : str;
    }

    public static void main(String[] args) {
        String input = "This is a long sentence.";
        System.out.println("Truncated: " + truncate(input, 10));
    }
}

package Lab3;

public class Counting_The_Number_of_Words {
	public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return str.isBlank() ? 0 : words.length;
    }

    public static void main(String[] args) {
        String input = "  Java is awesome   ";
        System.out.println("Word count: " + countWords(input));
    }
}

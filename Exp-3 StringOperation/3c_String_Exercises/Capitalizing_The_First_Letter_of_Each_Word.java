package Lab3;

public class Capitalizing_The_First_Letter_of_Each_Word {
	public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty())
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello java world";
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}

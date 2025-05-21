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


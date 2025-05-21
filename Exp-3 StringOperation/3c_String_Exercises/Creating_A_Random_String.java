/*
9.Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
*/
package Lab3;

import java.util.*;

public class Creating_A_Random_String {
	public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random string: " + generateRandomString(8));
    }
}

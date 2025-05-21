/*
2.Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
*/
package Lab3;

public class Counting_Substring {
	public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "banana";
        String sub = "an";
        System.out.println("Occurrences: " + countOccurrences(main, sub));
    }
}

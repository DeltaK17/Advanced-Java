/*
2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
*/

package Lab1;
import java.util.*;

public class descIterator_linkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		Iterator iterator =  ls.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
	}
}

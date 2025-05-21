/*
3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink")).
*/

package Lab1;
import java.util.*;

public class index_of_linkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		for(int i=0;i<ls.size();i++) {
			System.out.println("index: "+i+" value:"+ls.get(i));
		}
	}

}

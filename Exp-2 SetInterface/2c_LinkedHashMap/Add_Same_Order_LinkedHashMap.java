/*
4.Add elements in the same order in the LinkedHaspMap using for() loop and put() String[] keys = {"C", "A", "B", "E", "D"}; Integer[] values = {3, 1, 2, 5, 4}; 
*/
package Lab2;
import java.util.*;
public class Add_Same_Order_LinkedHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		Map<String,Integer> lMap = new LinkedHashMap<>();
		for(int i=0;i<keys.length;i++) {
			lMap.put(keys[i], values[i]);
		}
		System.out.println(lMap);

	}
}

package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> de = new ArrayDeque<String>();
		de.add("Bhavani");
		de.add("Sony");
		de.add("Manikumar");
		de.add("Meenakshi");
		
		for(String str:de) {
			System.out.println(str);
		}	
		de.add("Mothi");
		for(String str1:de) {
			System.out.println(str1);
		}
		de.pollLast();
		for(String str2:de) {
			System.out.println(str2);
		}
	}
}

package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Vishu");
		ts.add("Krishna");
		ts.add("Vaibhu");
		ts.add("Adi");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
		
		System.out.println("Descending order");
		Iterator i = ts.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("Removing lowest element: "+ts.pollFirst());
		
		System.out.println("Removing Highest element:"+ts.pollLast());
		
		System.out.println("Head Set :"+ts.headSet("Vaibhu"));
		
		System.out.println("SubSet :"+ts.subSet("Krishna", "Vishnu"));
		
		System.out.println("tailSet :"+ts.tailSet("Ravi"));
	}
}

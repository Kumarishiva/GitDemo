package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Kusha");
		queue.add("Rahul");
		
		System.out.println("Head:"+queue.element()); //retuns head element
		System.out.println("Head:"+queue.peek()); 
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println(" 	");
		queue.remove();
		queue.poll();
		System.out.println(queue);		
	}
}

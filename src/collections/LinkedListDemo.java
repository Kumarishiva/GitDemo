package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Vishu");
		list.add("Sanju");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Vishu");
		list.add("Sanju");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
			
		}
		System.out.println("Adding element at specified index");
		list.add(0, "Garva");
		System.out.println(list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Bhavani");
		list1.add("Kirankumar");
		
		System.out.println("Adding another list1 to list");
		list.addAll(list1);
		System.out.println(list);
		
		System.out.println("Adding element to the first Position");
		list.addFirst("Manikumar");
		System.out.println(list);
		
		System.out.println("Adding element at the last");
		list.addLast("Harsh");
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+ " ");
		}
		System.out.println();
		
		System.out.println("Removing Specfic element");
		list.remove("Garva");
		System.out.println(list);
		
		System.out.println("Removing at specified index");
		//list.remove(3);
		//System.out.println(list);
		
		System.out.println("Removing list1 items from list");
		list.removeAll(list1);
		System.out.println(list);
		
		System.out.println("Removing first element from the list");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("Removing last element from the list");
		list.removeLast();
		System.out.println(list);
		
		System.out.println("Removing First occurance");
		list.removeFirstOccurrence("Ravi");
		System.out.println(list);
		
		System.out.println("Removing last Occurance");
		list.removeLastOccurrence("Sanju");
		Iterator<String> itr2 = list.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		System.out.println(" ");
		//Traversing list elemets in reverse order
		System.out.println("Descending order");
        Iterator i = list.descendingIterator();
        while(i.hasNext()) {
        	System.out.print(i.next()+" ");
        }
        
        System.out.println(" ");
        System.out.println("Fetching specific element from list "+list.get(4));   
        
        System.out.println("Creating clone");
        LinkedList sec_list = new LinkedList();
        sec_list = (LinkedList) list.clone();       
        System.out.println(sec_list);
        
}
}
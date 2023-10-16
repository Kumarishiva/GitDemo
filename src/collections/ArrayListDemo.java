package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating list
		ArrayList<String> a1 =  new ArrayList<String>(); 
		//adding objects in array list
		a1.add("Mango");
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Grapes");
		a1.add("Kiwi");
		System.out.println(a1); //o/p [Mango, Apple, Banana, Grapes, Kiwi]
		
		//Iterating through iterator
		System.out.println("Iterating through iterator");
		Iterator itr = a1.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    
	    //accesing element through get() method
	    System.out.println("accesing element through get() method");
	    
	    System.out.println("Returning element "+a1.get(1));
	    
	    //changing the element
	    System.out.println("Replacing element");
	    a1.set(1, "Dates");
	    
	  //Traversing list through for-each loop
	    System.out.println("Traversing list through for-each loop");
	    for(String fruit:a1) {
	    	System.out.println(fruit);
	    }
	    System.out.println("Sorting ArrayList");
	    Collections.sort(a1);
	    Iterator itr1 = a1.iterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	        
	    System.out.println("Reversing ArrayList");
	    ListIterator itr2 =a1.listIterator(a1.size());
	    while(itr2.hasPrevious()) {
	    	System.out.println(itr2.previous());
	    }
	    
	    System.out.println("Traversing through for loop");
	    for(int i=0; i<a1.size(); i++) {
	    	System.out.println(a1.get(i));
	    }
	    
	    System.out.println("Adding anoter arraylist to a1");
	    ArrayList<String> a3 = new ArrayList<String>();
	    a3.add("Orange");
	    a3.add("ButterFrui");
	    a1.addAll(a3);
	    System.out.println(a1);
	    
	   
	    System.out.println("Adding to specified index");
	    a1.addAll(0, a3);
	    System.out.println(a1);
	    
	    System.out.println("Removing element on the basis o specific position");
	    a1.remove(2);
	    System.out.println(a1);
	    
	    System.out.println("Removing specific element");
	    a1.remove("Kiwi"); //case senstive
	    System.out.println(a1);
	    
	    System.out.println("Removing a3 elements from a1");
	    a1.removeAll(a3);
	    System.out.println(a1);
	    
	    System.out.println("Retaining all element");
	    //a1.retainAll(a3);
	    System.out.println("Is ArrayList a1 empty="+a1.isEmpty());
	    

	    System.out.println("Integer into ArrayList");
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    a2.add(34);
	    a2.add(51);
	    a2.add(32);
	    a2.add(56);
	    a2.add(1);
	    
	    Collections.sort(a2);
	    for(Integer number:a2) {
	    	System.out.println(number);
	    }    
	}

}

package collections;

import java.util.LinkedHashSet;

class BookStore{
	int id;
	String name,author,publisher;
	int quantity;
	public BookStore(int id,String name,String author,String publisher,int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher= publisher;
		this.quantity= quantity;
			}
}
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<BookStore> hs= new LinkedHashSet<BookStore>();
		BookStore b1 = new BookStore(101,"Let us C","Yashwant Kanekar","BPB",8);
		BookStore b2 = new BookStore(102,"Data Communication and Networking","Forouzan","Mc Gram Hill",4);
		
		hs.add(b1);
		hs.add(b2);
		
		//traversing hash table
		for(BookStore b:hs) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}

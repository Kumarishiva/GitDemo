package collections;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id =id;
		this.name= name;
		this.author= author;
		this.publisher=publisher;
		this.quantity=quantity;			
	}
}
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating list of Book
		List<Book> list = new ArrayList<Book>();
		
		//Creating Book
		Book b1 = new Book(101, "Let us C", "Yashwanth Kanetkar", "BPB",8);
		Book b2 = new Book(102, "Data Communication","Forouzan", "MC Graw Hill",4);
		
		list.add(b1);
		list.add(b2);
		
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		System.out.println("Size of Book "+ list.size());
	}
}

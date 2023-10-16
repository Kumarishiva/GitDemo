package javaTPointStringMethods;

public class EqulasDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "HELLO";
		
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3)); // fasle its case sensitive
		
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		String s4 = "a";
		@SuppressWarnings("removal")
		Character c  = new Character('a');
		System.out.println(s4.equals(c)); //false
		
		// we are comparing a String with different data types  
		// To achieve the true value, we have to convert   
		
		System.out.println(s4.equals(c.toString())); //true
		
		
		
				
	}

}

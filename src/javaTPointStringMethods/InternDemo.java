package javaTPointStringMethods;

public class InternDemo {

	public static void main(String[] args) {

		//intern() method create the string into sting constant pool
		String str = new String("Welcome");
		String str1 = new String("Welcome");
		System.out.println(str==str1); // fasle
		
		String s1 = new String("Shivakumari").intern();
		String s2 = new String("Shivakumari").intern();
		System.out.println(s1==s2); //true
		
		String st1 = new String("Hello");
		String st2 = "Hello";
		String st3 = st1.intern();
		System.out.println(st1==st2); //false
		System.out.println(st2==st3); //true

	}

}

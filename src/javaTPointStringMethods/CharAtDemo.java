package javaTPointStringMethods;

public class CharAtDemo {

	public static void main(String[] args) {

		String s = "Vaibhavi";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(7)); 
		//System.out.println(s.charAt(8)); //index out of bond exception
		//System.out.println(s.charAt(-1)); //index out of bond exception
		
		char ch = s.charAt(5);
		System.out.println(ch);
		
		int slength = s.length(); //8
		System.out.println("Character at last index is "+ s.charAt(slength-1));
	}

}

package javaTPointStringMethods;

public class ContainsMethod {

	public static void main(String[] args) {

		String s1 ="What do you know about me";
		System.out.println(s1.contains("about me")); //true
		System.out.println(s1.contains("Hello")); //false
		
		System.out.println(s1.contains("WHAT")); //false its case senstive
		
		boolean isContains = s1.contains("do");
		System.out.println(isContains); //true
	}

}

package javaTPointStringMethods;

public class StartEndCases {

	public static void main(String[] args) {

		String s1 = "Javatpoint";
		// no offset is mentioned; hence offset is 0 in this cases
		System.out.println(s1.startsWith("Jav"));//true its case senstive
		System.out.println(s1.startsWith("")); //true (its always start with empty string
		System.out.println(s1.startsWith("jav")); //false its case senstive
		System.out.println(s1.endsWith("nt")); //true
		
		//offset which indicates the index
		System.out.println(s1.startsWith("J",0)); //(startWith(String prefix, int offset))
		
		System.out.println(s1.endsWith("javatpoiny")); //false case senstive
		System.out.println(s1.endsWith("Javatpoint")); //true
		
		if("Welcome to java".endsWith("va")) {
			System.out.println("inside if block");
		}
		else {
			System.out.println("Inside else block");
		}
		
	}

}

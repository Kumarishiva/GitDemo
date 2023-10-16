package javaTPointStringMethods;

public class LengthDemo {

	public static void main(String[] args) {
		String s1 = "Javatpoint";
		String s2 = " ";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
//		if(s1.length()>0) {
//			System.out.println("String is not empty and string length"+s1.length());
//		}
//		
		if(s2.length()==0) {
			System.out.println("String is empty");
		}
	}

}

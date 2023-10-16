package javaTpointString;

public class ImmutableString {

	public static void main(String[] args) {

		//String s = "Sachin";
		//s.concat("Tendular");
		//System.out.println(s);
		
		//String v = "Virat";
		//v = v.concat(" kohli");
		//System.out.println(v);
		
		String s = "Shiva";
		
		System.out.println("s = " + s);
		
		String s1 = s;
		String s2 = s;
		String s3 = s;
		
		s = "Prem";
		System.out.println("s = " + s);
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		String v1 ="Vaibhavi";
		
	}

}

package javaTpointString;

public class TestSringComparison {

	public static void main(String[] args) {

		String s1="Sachin";
		String s2="sachin";
		String s3= new String("Sachin");
		String s4="Saurav";
		
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s2.equals(s3)); //false
		System.out.println(s3.equals(s4)); //false
	}

}

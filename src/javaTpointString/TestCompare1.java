package javaTpointString;

public class TestCompare1 {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1==s2); //true(because referes to the same reference)
		System.out.println(s2==s3); //false(because s3 refers to the instance created in nonpool
				
	}

}

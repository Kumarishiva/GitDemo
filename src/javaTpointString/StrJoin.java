package javaTpointString;

public class StrJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello");
		String s2 = new String(" beautifull");
		String s3 = new String(" world");
		String s = String.join("",s1,s2,s3);
		System.out.println(s);

	}

}

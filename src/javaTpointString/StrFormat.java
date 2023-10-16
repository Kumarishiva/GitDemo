package javaTpointString;

public class StrFormat {

	public static void main(String[] args) {

		String s1 = new String("Hello"),s2 = new String("Mrs"),s3 = new String("Shivakumari");
		String s = String.format("%s%s%s", s1,s2,s3);
		System.out.println(s);
	}

}

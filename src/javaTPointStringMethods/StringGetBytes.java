package javaTPointStringMethods;

public class StringGetBytes {

	public static void main(String[] args) {

		String s1 = "ABCDEF";
		byte[] barr = s1.getBytes();
		for(int i =0; i<barr.length; i++) {
			System.out.println(barr[i]);
		}
	}
	
	
	//getting String back;
	   //String s2 = new String(barr);
		//https://www.javatpoint.com/java-string-getbytes
	

}

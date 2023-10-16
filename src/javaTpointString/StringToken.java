package javaTpointString;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {

		//It tokanize the string on the basis of whitespace
		StringTokenizer st = new StringTokenizer("My name is Shivakumari"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("my,name,is,khan");
		//System.out.println("Next Token is: "+st1.nextToken(","));
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken(","));
		}
		
		
	}

}

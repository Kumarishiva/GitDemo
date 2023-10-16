package javaTPointStringMethods;

public class ValueOfDemo {

	public static void main(String[] args) {

		//coverts all primitive datatypes to String
		int value = 30;
		String s = String.valueOf(value);
		System.out.println(s+30); //3030
		
		char ch1 ='A';
		String s1 = String.valueOf(ch1);
		System.out.println(s1); //A
		
		float f1 = 10.34f;
		String sf = String.valueOf(f1);
		System.out.println(sf+10); //10:3410
	}

}

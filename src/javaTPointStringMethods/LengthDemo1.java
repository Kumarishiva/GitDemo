package javaTPointStringMethods;

public class LengthDemo1 {

	public static void main(String[] args) {

		String str ="Welcome to JavaTpoint";
		int size =str.length();
		System.out.println(size);
		System.out.println("Reverse of the string"+""+str+""+"is");
		for(int i=0;i<size;i++) {
			System.out.print(str.charAt(str.length()-i-1));
		
		}
				}

}

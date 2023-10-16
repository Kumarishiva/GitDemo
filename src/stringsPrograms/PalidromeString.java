package stringsPrograms;

public class PalidromeString {

	
	public static String reverseString(String str) {
		
		String reveresedString = "";
		for(int i= str.length()-1; i>=0; i--) {
			reveresedString = ""+ str.charAt(i);
			System.out.print(reveresedString);
		}
		return reveresedString;
		
	}
	public static void main(String[] args) {
		
		String inputString = "madam";
		String reveresedString = reverseString(inputString);
		
		if(inputString.equals(reveresedString)) {
			System.out.println("It is a palidrome");
		}
		else {
			System.out.println("Its not a palidrome");
		}
		
	}
}

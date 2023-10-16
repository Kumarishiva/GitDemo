package stringsPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Shivakumari";
		String reversedString = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reversedString = reversedString+ name.charAt(i);
		}
		System.out.println("Reveresed String = "+reversedString);
	}
}

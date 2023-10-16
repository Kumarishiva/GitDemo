package stringsPrograms;

import java.util.Arrays;

public class ArrayToString {

	public static String convertArrayToString(String[] stringArry) {
		return Arrays.toString(stringArry);
		
	}
	public static void main(String[] args) {
		
		String[] stringArray = {"My", "name", "is", "Shivakumari","!"};
		System.out.println(ArrayToString.convertArrayToString(stringArray));
		
	}
}

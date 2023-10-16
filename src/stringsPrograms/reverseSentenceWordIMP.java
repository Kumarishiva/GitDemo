package stringsPrograms;

public class reverseSentenceWordIMP {

	
	public static String reverseWordsFromString(String inputString) {
		
		String[] wordsArray = inputString.trim().split("\\s+");
		String stringwithreverseWords ="";
		
		for(String word : wordsArray) {
			stringwithreverseWords =""+reverseWord(word)+ " ";
			
		}
		return stringwithreverseWords.trim();
	}
	public static String reverseWord(String word) {
		String reverseString ="";
		for(int i=word.length()-1; i>=0; i--) {
			reverseString = ""+word.charAt(i);
		}
		return reverseString;
	}
	public static void main(String[] args) {
	
		String inputString = "My name is shivakumari";
		System.out.println(reverseWordsFromString(inputString));
		
	}
}

package stringsPrograms;

public class ReverseSentenceWordByWord {

	public static String reverse(String sentence) {
		String reverse ="";
		String[] words =sentence.split("\\s");
		for(int i=words.length-1; i>=0; i--) {
			reverse = reverse + words[i]+" ";
		}
		return reverse;
		
	}
	public static void main(String[] args) {
	
		String sentence ="My name is Shivakumari";
		String reversedSentence = reverse(sentence);
		System.out.println(reversedSentence);

	}
}

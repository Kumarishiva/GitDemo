package basicPrograms;

public class FindOddEvenNum {

	public 	static void findNumber(int num) {
		
		if(num%2!=0) {
			System.out.println(num +" is odd number");	
		}
		else {
			System.out.println(num +" is eveb number");
		}
	}
	public static void main(String args[]) {
		int num =32;	
	 findNumber(num);
	}
	
	
}

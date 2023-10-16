package basicPrograms;

public class ReverseNum {

	
	public static void reverseNo(int num) {
		int reverse = 0;
		while(num!=0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		System.out.println("Revers of no =" + reverse);
	}
	public static void main(String[] args) {
		int num = 8769;
		reverseNo(num);
		
	}
}

package stringsPrograms;

import java.util.Scanner;

public class CompareTwoString {

	public static void compare(String s1 , String s2) {
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
				
			}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String first = sc.next();
		String second = sc.next();
		compare(first,second);
		
		
	}
}

package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stk = new Stack<>();
		
		System.out.println("is the stack empty? "+ stk.empty());
		
		//pushing elemenets into the stack
		
		stk.push(23);
		stk.push(15);
		stk.push(9);
		stk.push(90);
		stk.push(120);
		stk.push(43);
		System.out.println("Element in stk:"+stk);
		
		System.out.println("is the stack empty? "+ stk.empty());
		
		int lastDigit = stk.peek();
		System.out.println("Elements at top "+lastDigit);
		
		int location = stk.search(90);
		System.out.println("Location of 90 "+location);
		
		int size =stk.size();
		System.out.println("Size of Stack "+size);
		
	}
}

package javaTpointString;

import java.util.Arrays;

public class TestSubstring2 {

	public static void main(String[] args) {

		String text = new String("Hello, My name is Sachin");
		String[] sentences = text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}

}

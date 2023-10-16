package javaTpointString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liststr = Arrays.asList("abc","pqr","xyz");
		String str = liststr.stream().collect(Collectors.joining(", "));
		System.out.println(str);
	}

}

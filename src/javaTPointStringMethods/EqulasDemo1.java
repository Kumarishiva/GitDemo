package javaTPointStringMethods;

import java.util.ArrayList;

public class EqulasDemo1 {

	public static void main(String[] args) {

		String str ="Mukesh";
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Suresh");
		list.add("Ravi");
		list.add("Pranesh");
		list.add("Ajay");
		list.add("Mukesh");
		for(String st :list) {
			if(st.equals(str)) {
				System.out.println("Mukesh is present");
			}
		}
		
	}

}

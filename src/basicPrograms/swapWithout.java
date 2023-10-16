package basicPrograms;

public class swapWithout {

	public static void main (String[] args) {
		
		int x = 10;
		int y = 5;
		 x = x + y;
		 y = x - y;
		 x = x - y;
		 
		 System.out.println("Value after swapping x = " +x+ "\n y = "+ y);
	}
}

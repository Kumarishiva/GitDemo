package javaTPointStringMethods;

public class ContainsDemo1 {

	public static void main(String[] args) {
		String str = "To learn Java visit Javatpoint.com";
		if(str.contains("Javatpoint.com")) {
			System.out.println("This string contains Javatpoint.com");
		}
		else
		{
			System.out.println("Result not found");
		}
	}
}

package geeksForgeeks;

class Geek{
	static String geekName= "";
	public static void geek(String name) {
		geekName=name;
	}
}
public class StaticMethod {

	public static void main(String[] args) {

		//Accessing static method using class name itself
		Geek.geek("Vaibhavi");
		System.out.println(Geek.geekName);
		
		Geek g1 = new Geek();
		g1.geek("krishna");
		System.out.println(g1.geekName);
	}

}

package geeksForgeeks;

class Foo{
	
	String name = " ";
	
	public void Geeks(String name) {
		this.name = name;
	}
}

public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating instance of class
		Foo f1 = new Foo();
		
	    //calling an instance method 
		f1.Geeks("GeeksforGeeks");
		System.out.println(f1.name);
	}

}

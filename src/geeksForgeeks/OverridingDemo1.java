package geeksForgeeks;
class parent_01{
	//private methods are not overridden
	private void m1() {
		System.out.println("From Parent m1");
	}
	protected void m2() {
		System.out.println("From Parent m1");
	}
}
class child_01 extends parent_01{
	//new m1() method
	//unique to child class
	private void m1() {
		System.out.println("From Child m1");
	}
	//Overriding method with more accessibility
	public void m2() {
		System.out.println("From Child m2");
	}
}
public class OverridingDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		parent_01 ob1 = new parent_01();
		ob1.m2();
		parent_01 ob2 = new child_01();
		ob2.m2();	
	}
}

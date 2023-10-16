package geeksForgeeks;

abstract class A{
	
	//abstract method with no body
	abstract void m1();
	
	//concrete method(Method without abstract)
	void m2(){
		System.out.println("This is concrete method");
	}
}
class B extends A{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is implemention of m1");
	}
}
public class AbstractMethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.m1();
		b.m2();
	}
}

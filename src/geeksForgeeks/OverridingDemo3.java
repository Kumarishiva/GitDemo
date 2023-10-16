package geeksForgeeks;
class SuperClass{
	private void privateMethod() {
		System.out.println("Private Method in Superclass");
	}
	public void publicMethod() {
		System.out.println("Public Method in SuperClass");
		 privateMethod();
	}
}
class SubClass extends SuperClass{
	//this is a new method with same name as privateMethod() in superclass 
	private void privateMethod() {
		System.out.println("Private Method in Subclass");
	}
	//this method overrides public method in superclass
	public void publicMethod() {
		System.out.println("Public Method in Subclass");
		privateMethod(); //calss privatemethod of subclass
	}
}
public class OverridingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass ob1 = new SuperClass();
		ob1.publicMethod();
		
		SubClass ob2 = new SubClass();
		ob2.publicMethod();
		
		SuperClass ob3 = new SubClass();
		ob1.publicMethod();		
	}
}

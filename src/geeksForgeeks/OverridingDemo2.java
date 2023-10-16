package geeksForgeeks;
class Parent_02{
	//static method in the base class
	//which will be hidden in subclass
	static void m1(){
		System.out.println("From Parent static m1");
	}
	//non static method will be
	//Overridden in derived class
	void m2() {
		System.out.println("From Parent non static(instance) m2");
	}
}
class Child_02 extends Parent_02{
	//this method hides m1() in present
	static void m1() {
		System.out.println("From child static m1");
	}
	//this method overrides m2() in parent
	public void m2() {
		System.out.println("From child non static m2");
	}
}
public class OverridingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Parent_02 obj1 = new Child_02();
		//as per overiding rule this should 
		//call to class child static overriden method
		//Since static method can be overriden, it calls Parents m1 
		obj1.m1();
		//here overiding works and child's m2 is called
		obj1.m2();
	}

}

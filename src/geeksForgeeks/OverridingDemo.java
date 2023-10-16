package geeksForgeeks;

class Parent{
	void show() {
	System.out.println("Parent's show");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Child's show");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if a parent type references refers to parent object,
		//then parent'show is called
		Parent obj1 = new Parent();
		obj1.show();
		
		//if a parent type references refers to child object,
	    //then child'show is called
		//This is called Run time polymorphism
		Parent obj2 = new Child();
		obj2.show();		
	}
}

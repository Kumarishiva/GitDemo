package geeksForgeeks;

//abstract method
abstract class arithmetic_oper{
	abstract void printInfo();
}
//class add
class add extends arithmetic_oper{

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		int a =3;
		int b =4;
		System.out.println(3+4);
	}

	// class must override PrintInfor() method compile time exception	
}
class sub extends arithmetic_oper{

	@Override
	void printInfo() {
		int c =7;
		int d =8;
		System.out.println(c-d);		
	}
	
}
public class AbstractMethodDemo {

	public static void main(String[] args) {

		arithmetic_oper a = new add();
		a.printInfo();
		arithmetic_oper b=  new sub();
		b.printInfo();	
	}

}

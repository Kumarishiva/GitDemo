package objectcAndclass;

class Employee {
	
	int id;
	String name;
	float salary;
	
	void insert(int i, String n,float s) {
		id=i;
		name=n;
		salary=s;		
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
	
		e1.insert(11, "Sony", 56000);
		e2.insert(12, "Mani", 60000);
		e3.insert(13, "Bhavani", 70000);
		
		e1.display();
		e2.display();
		e3.display();
	}
}

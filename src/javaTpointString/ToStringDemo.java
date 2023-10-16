package javaTpointString;

class Student{
	int rollNo;
	String name;
	String city;
	
	Student(int rollNo, String name, String city){
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return rollNo+" "+name+" "+city;
		
}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
	Student s1 = new Student(101, "Sony", "Bengalore");
	Student s2 = new Student(102,"Prem", "Gubbi");
	System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	

	}

}



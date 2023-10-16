package javaTpoint;


 class Student{
	int id ;
	String name;
}
public class PracticeObjects {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id =23;
		s1.name = "Sony";
		
		s2.id = 32;
		s2.name = "Prem";
		System.out.println(s1.id +"  "+s1.name);
		System.out.println(s2.id +"  "+s2.name);
	}
}

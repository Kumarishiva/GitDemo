package javaTpointString;

 final class Employee{
	final String PancardNumber;
	public Employee(String PancardNumber) {
		this.PancardNumber = PancardNumber;		
	}
	public String getPancardNumber() {
		return PancardNumber;
		
	}
}
public class ImmutableDemo {

	public static void main(String[] args) {

		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("PancardNumber:"+s1);
		
	}

}

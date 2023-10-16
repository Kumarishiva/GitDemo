package javaTpoint;

class Student1{
	int rollNo;
	String name;
	
	void insertRecord(int r, String n) {
		
		rollNo=r;
		name=n;
	}
	void displayInformation() {
		System.out.println(rollNo+" "+name);
	}
	
}
 class InitThroughMethod {
 
	 public static void main(String[] args) {
	 Student1 s = new Student1();
	 s.insertRecord(111,"Sony");
	 s.displayInformation();	
	 
	 Student1 s1 = new Student1();
	 s1.insertRecord(112, "Prem");
	 s1.displayInformation();
	 }
}

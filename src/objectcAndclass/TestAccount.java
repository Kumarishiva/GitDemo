package objectcAndclass;

 class Account{
	
	 int acc_no;
	 String name;
	 float amount;
	 
	 //method to initialize object
	 void insert(int a, String n, float amt) {
		 acc_no=a;
		 name=n;
		 amount=amt;	 
	 }
	 
	 //method to deposit
	 void deposit(float amt) {
		 amount = amount+amt;
		 System.out.println(amt+"deposited");
	 }
	 
	 //method to withdrawn
	 void withdrawn(float amt) {
		 if(amount<amt) {
			 System.out.println("Insufficient Balance");
		 }
		 else {
			 amount = amount-amt;
			 System.out.println(amt+"Withdrawn");
		 }
	 }
	//method to check the balance
	 void CheckBalance() {
		 System.out.println("Balance is"+amount);
	 }
	 
	 void display() {
		 System.out.println(acc_no+" "+name+" "+amount);
	 }
	 
}
public class TestAccount {

	public static void main(String[] args) {

	}

}

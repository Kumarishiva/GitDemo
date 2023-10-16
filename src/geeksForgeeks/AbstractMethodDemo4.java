package geeksForgeeks;

interface Sum{
	
	public abstract int Oper_two_var(int a, int b);
	int Oper_three_var(int a, int b, int c);
}
 class Operation implements Sum{

	@Override
	public int Oper_two_var(int a, int b) {
	// TODO Auto-generated method stub
		return a*b;
	}

  @Override
  public int Oper_three_var(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a*b*c;	
		}
	
}
public class AbstractMethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Interface implemention");
		Operation a = new Operation();
		System.out.println(a.Oper_two_var(4, 5));
		System.out.println(a.Oper_three_var(5, 6, 7));
		
	}

}

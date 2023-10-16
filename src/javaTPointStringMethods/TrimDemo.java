package javaTPointStringMethods;

public class TrimDemo {

	public static void main(String[] args) {

		String st =" Prem ";
		String st1 = " Shivakumari";
		String st2 =st.trim()+ ""+ st1.trim();
		System.out.println(st2); //PremShivakumari
		String st3= st.concat(st1).trim(); //doesnt remove middle space Prem  Shivakumari
		System.out.println(st3);
		String s1 = "  Hello String";
		System.out.println(s1.trim()+" java point"); //Hello String java point
		
		System.out.println(st.length()); // 6
		System.out.println(st.trim().length()); //4
		String str =" abc ";
		if((str.trim()).length()>0) {
			System.out.println("The String contains charcter other then white spaces");
		}else {
			System.out.println("The String contains white spaces only");
		}
		
		String str2 ="   ";
		if((str2.trim()).length()>0) {
			System.out.println("The String contains charcter other then white spaces");
		}else {
			System.out.println("The String contains white spaces only");
		}
		
		
	}

}

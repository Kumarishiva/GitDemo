 package stringsPrograms;

public class ReverseSentenceInterview {

	  public static String reverse(String str) {
		  String[] Starray= str.split(" ");	
		  String rev="";
		  for(int i =0; i<=Starray.length-1; i++) {
			  String s1 = Starray[i];
			  String s2="";
			  for(int j=s1.length()-1; j>=0; j--) {
				   s2 =s2 + s1.charAt(j);
			  }
			  rev=rev+s2+" ";
		  }
		  
		  
		return rev;
     	 
      }
	public static void main(String[] args) {

         String  s = "My name is Shiva";
         
         System.out.println(reverse(s));
        
		
	}

}

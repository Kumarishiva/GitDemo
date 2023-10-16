package basicPrograms;

public class maxNo {
	
public static void main(String[] args) {
	int a[]= {50,23,46,78,90};
	int max = a[0];
	for(int i=1; i<a.length; i++) {
		
		if(a[i]>max) {
			max = a[i];		
		}
	}
	System.out.println("Maximum no ="+ max);
}
}

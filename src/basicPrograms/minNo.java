package basicPrograms;

public class minNo {
	
	public static void main(String[] args) {
		
		int a[]= {43, 56, 78, 97, 21};
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum no ="+ min);
	}

}

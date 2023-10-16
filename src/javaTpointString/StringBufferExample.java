package javaTpointString;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb); //Hello Java
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");
		System.out.println(sb1); // HJavaello
		
		StringBuffer sb2 = new StringBuffer("Prem ");
		sb2.replace(1,3,"Shiva");
		System.out.println(sb2); // PShivam
		
		StringBuffer sb3 = new StringBuffer("Prem ");
		sb3.delete(2, 4);
		System.out.println(sb3); //pr
		
		StringBuffer sb4 = new StringBuffer("Beautifull");
		sb4.reverse();
		System.out.println(sb4); //llufituaeB
		
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());
		
		sb5.append("hello");
		System.out.println(sb5.capacity());
		
		sb5.append("Java is my Favourite languaue");
		System.out.println(sb5.capacity()); // (16*2)+2= 34 (oldcapcity*2)+2
		
		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6.capacity());
		sb6.append("Hello");
		System.out.println(sb6.capacity());
		
		sb6.append("Java is my favourite language");
		System.out.println(sb6.capacity());
		
		sb6.ensureCapacity(10);
		System.out.println(sb.capacity());
		
		sb6.ensureCapacity(50);
		System.out.println(sb.capacity());
		
	}

}

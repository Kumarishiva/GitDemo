package objectcAndclass;

class Reactangle{
	int length;
	int width;
	void insert(int l, int w) {
		length=l;
		width=w;
	}
	void CalculateArea() {
		System.out.println(length*width);
	}
}
public class TestReactangle {

	public static void main(String[] ags) {
	
		Reactangle r1 = new Reactangle(), r2 = new Reactangle();
		r1.insert(11, 5);
		r2.insert(12, 7);
		r1.CalculateArea();
		r2.CalculateArea();
		
		
	}
}

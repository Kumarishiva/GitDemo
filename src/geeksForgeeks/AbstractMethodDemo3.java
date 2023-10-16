package geeksForgeeks;

abstract class Geometry{
	abstract void rect(int height,int width);
	abstract void square(int side);
	abstract void circle(float radius);
}
class easy extends Geometry{

	@Override
	void rect(int height, int width) {
		// TODO Auto-generated method stub
		int re = height*width;
		System.out.println("Area is a reactable="+re);
	}

	@Override
	void square(int side) {
		// TODO Auto-generated method stub
		int sq = side*side;
		System.out.println("Area of square="+sq);
	}

	@Override
	void circle(float radius) {
		// TODO Auto-generated method stub
		float ci = 3.14f*radius*radius;
		System.out.println("Area of float="+ci);				
	}
	
}
public class AbstractMethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 easy e = new easy();
		 e.rect(12,13);
		 e.square(12);
		 e.circle(4.5f);		    
	}

}

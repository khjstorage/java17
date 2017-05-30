package oopTest2;

class PointTest {
	public static void main(String args[]) {
		APoint3D p3 = new APoint3D(1,2,3);
	}
}

class Point1 {
	int x;	
	int y;
	
	Point1(){}

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class APoint3D extends Point1 {
	int z;

	APoint3D(int x, int y, int z) {
		
		super.x = x;
		super.y = y;
		this.z = z;
	}

	String getLocation() {	// 오버라이딩
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}

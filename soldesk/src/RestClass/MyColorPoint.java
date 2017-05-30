package RestClass;

class MyColorPoint extends MyPoint {
	String c;
	
	MyColorPoint(int x, int y, String color){
		super(x,y);
		c = color;
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		super.x =x;
		super.y = y;
	}

	@Override
	protected void reverse() {
		// TODO Auto-generated method stub
		int temp = x;
		x = y;
		y = temp;
	}
	
	protected void show(){
		System.out.println(x+" , "+y+" , "+c);
	}

}




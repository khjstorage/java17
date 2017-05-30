package oopTest;

class Cpoint {
	int a, b;
	String c;
	
	public Cpoint(int i, int j){
		this.a = i;
		this.b = j;
		c = "";
	}
	
	public void show(){
		System.out.println("(" + a + "," + b +")" + c);
	}
	
	public String toString()
	{
		return "("+a+","+b+")¿‘¥œ¥Ÿ.";
	}
}

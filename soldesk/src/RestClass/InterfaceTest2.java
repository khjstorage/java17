package RestClass;

interface I2{
	public abstract void play();
}

class B2 implements I2{
	public void play(){
		System.out.println("play in B class");
	}
}

class C2 implements I2{
	public void play(){
		System.out.println("play in C class");
	}
}

class A2 {
	void autoPlay(I2 i){
		i.play();
	}
}

class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C2());
	}

}




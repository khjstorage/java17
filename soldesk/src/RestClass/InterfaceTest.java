package RestClass;

class A{
	public void methodA(B b){
		b.methodB();
	}
}

class B{
	public void methodB(){
		System.out.println("methodB()");
	}
}

class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA(new B());
	}

}

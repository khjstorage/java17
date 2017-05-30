package oopTest2;

public class Tiger extends Animal {
	
	Tiger(String name){
		super(name);
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("어흥~~!!");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("우측으로 빠르게 움직인다.");
	}

}

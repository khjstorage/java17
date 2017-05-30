package oopTest2;

public class Dog extends Animal {
	String animal_Name;
	String Name;
	
	Dog(String name){
		super(name);
	}
	
	Dog(){
		this.animal_Name ="강아지";
		this.Name = "밥";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍~~!!!");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("왼쪽으로 느리게 달린다.");
	}
	
	public void print2(){
		System.out.println("Dog 클래스");
	}
	
	public void print(){
		System.out.println("Dog 클래스2");
	}

}

package oopTest2;

public class Dog extends Animal {
	String animal_Name;
	String Name;
	
	Dog(String name){
		super(name);
	}
	
	Dog(){
		this.animal_Name ="������";
		this.Name = "��";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("�۸�~~!!!");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("�������� ������ �޸���.");
	}
	
	public void print2(){
		System.out.println("Dog Ŭ����");
	}
	
	public void print(){
		System.out.println("Dog Ŭ����2");
	}

}

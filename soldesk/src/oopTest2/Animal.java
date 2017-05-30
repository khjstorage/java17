package oopTest2;

abstract class Animal {
	String animal_Name;
	
	Animal(String name){
		animal_Name = name;
	}
	
	Animal(){
		this.animal_Name = "동물";
	}
	
	public abstract void cry();
	public abstract void behavior();
	
	public void print(){
		System.out.println("추상 클래스");
	}
}

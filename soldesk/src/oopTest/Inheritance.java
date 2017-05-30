package oopTest;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Human human = new Human();
		
		animal.action();
		animal.howl();
		mammal.action();
		mammal.howl();
		human.action();
		human.howl();
		human.speak();
	}

}

package oopTest;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal mammal2 = new Mammal();
		Mammal human2 = new Human();
		Human a = (Human)new Mammal();
		
		mammal2.action();
		mammal2.howl();
		human2.action();
		human2.howl();
		
		a.action();
		a.howl();
	}

}



package oopTest2;

public class ExamAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger("Hodol");
		tiger.cry();
		tiger.behavior();
		
		System.out.println("호랑이의 이름은 : "+tiger.animal_Name);
		
		Dog dog = new Dog("Mikey");
		dog.cry();
		dog.behavior();
		System.out.println("개의 이름은 : "+ dog.animal_Name);
		
		Animal dog2 = new Dog();
		dog2.cry();
		dog2.behavior();
		dog2.print();
//		dog2.print2(); 사용불가
		System.out.println("개의 이름은 : "+ dog2.animal_Name);
//		System.out.println("개의 이름은 :" +dog2.Name);	오류
		
	}

}








package oopTest2;

public class ExamAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger("Hodol");
		tiger.cry();
		tiger.behavior();
		
		System.out.println("ȣ������ �̸��� : "+tiger.animal_Name);
		
		Dog dog = new Dog("Mikey");
		dog.cry();
		dog.behavior();
		System.out.println("���� �̸��� : "+ dog.animal_Name);
		
		Animal dog2 = new Dog();
		dog2.cry();
		dog2.behavior();
		dog2.print();
//		dog2.print2(); ���Ұ�
		System.out.println("���� �̸��� : "+ dog2.animal_Name);
//		System.out.println("���� �̸��� :" +dog2.Name);	����
		
	}

}








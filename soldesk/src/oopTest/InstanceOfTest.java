package oopTest;

class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = (FireEngine)new Car();
		
		if(fe instanceof FireEngine){
			System.out.println("�̰��� FireEngine �ν��Ͻ��Դϴ�.");
		}
		
		if(fe instanceof Object){
			System.out.println("�̰��� Object �ν��Ͻ��Դϴ�.");
		}
		
		if(fe instanceof Car){
			System.out.println("�̰��� Car �ν��Ͻ��Դϴ�.");
		}
		
		System.out.println(fe.getClass().getName());
	}

}





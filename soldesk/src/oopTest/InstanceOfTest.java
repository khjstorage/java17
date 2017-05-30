package oopTest;

class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = (FireEngine)new Car();
		
		if(fe instanceof FireEngine){
			System.out.println("이것은 FireEngine 인스턴스입니다.");
		}
		
		if(fe instanceof Object){
			System.out.println("이것은 Object 인스턴스입니다.");
		}
		
		if(fe instanceof Car){
			System.out.println("이것은 Car 인스턴스입니다.");
		}
		
		System.out.println(fe.getClass().getName());
	}

}





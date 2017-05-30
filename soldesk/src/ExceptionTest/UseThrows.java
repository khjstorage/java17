package ExceptionTest;

public class UseThrows implements Cloneable{
	
	public void testClone() throws CloneNotSupportedException{
		UseThrows ut1 = (UseThrows)this.clone();
		System.out.println("복제 성공 : "+ut1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThrows ut = new UseThrows();
		System.out.println("복제시작"+ ut);
		
		try{
			ut.testClone();
		}catch(CloneNotSupportedException e){
			System.out.println("복제할 수 없는 객체입니다.");
			e.printStackTrace();
		}
	}

}



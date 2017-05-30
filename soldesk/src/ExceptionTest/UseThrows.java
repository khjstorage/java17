package ExceptionTest;

public class UseThrows implements Cloneable{
	
	public void testClone() throws CloneNotSupportedException{
		UseThrows ut1 = (UseThrows)this.clone();
		System.out.println("���� ���� : "+ut1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThrows ut = new UseThrows();
		System.out.println("��������"+ ut);
		
		try{
			ut.testClone();
		}catch(CloneNotSupportedException e){
			System.out.println("������ �� ���� ��ü�Դϴ�.");
			e.printStackTrace();
		}
	}

}



package RestClass;

public class TestNested {
	int i;
	static int j;
	
	public TestNested(){
		System.out.println("Outer Ŭ������ ������");
	}
	
	public void outMethod(){
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	
	public static void outStaticMethod(){
		System.out.println("Outer Ŭ������ static �޼���");
	}
	
	/* ��øŬ������ ���� */
	static class Nested{
		static int k;
		
		public Nested(){
			System.out.println("Inner ������");
		}
		
		public static void inMethod(){
//			i = 10;	// static ���������� instance ������ �ڿ��� ����� �� ����
			System.out.println("Inner �޼���");
			TestNested.j = 10;
//			outMethod()	// static ���������� instance ������ �ڿ��� ����� �� ����
			TestNested.outStaticMethod();
		}
	}// ��ø Ŭ������ end

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested.k = 10;
		Nested.inMethod();
	}

}





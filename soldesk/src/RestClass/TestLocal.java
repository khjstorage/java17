package RestClass;

public class TestLocal {
	int out_i;
	
	public TestLocal(){
		System.out.println("Outer Class�� ������");
	}
	
	public void method(int param_i, final int param_j){
		int local_i = 0;
		final int local_j = 0;
		
		//Local class ����
		class Local{
			int i;
			
			public Local(){
				System.out.println("Local class�� ������");
			}
			
			public void localMethod(){
				System.out.println("Outer Ŭ������ �ν��Ͻ� ����"+out_i);
				System.out.println("�Ķ���� param_j : "+param_j);
				System.out.println("�Ķ���� param_i : "+param_i);
				
				System.out.println("�������� local_i : "+local_i);
				System.out.println("�������� local_j : "+local_j);
				System.out.println("����Ŭ������ �޼���");
			}
		}//Local class end
		
		Local local = new Local();
		local.i = 10;
		local.localMethod();
	}// method end

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLocal tl = new TestLocal();
		tl.method(100, 200);
	}

}








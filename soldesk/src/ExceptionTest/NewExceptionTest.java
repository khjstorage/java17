package ExceptionTest;

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			startInstall();
			copyFiles();
		}catch(SpaceException e){
			System.err.println("���� �޽��� : "+e.getMessage());
			e.printStackTrace();
		}catch(MemoryException ex){
			System.err.println("���� �޽��� : "+ex.getMessage());
			ex.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		}finally{
			deleteTempFile();
		}
	}

	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static boolean enoughSpace(){
		return true;
	}
	
	static boolean enoughMemory(){
		return false;
	}
	
	static void copyFiles(){}
	static void deleteTempFile(){}
}

class SpaceException extends Exception{
	SpaceException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class MemoryException extends Exception{
	public MemoryException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}





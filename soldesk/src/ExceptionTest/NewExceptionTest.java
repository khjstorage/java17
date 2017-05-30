package ExceptionTest;

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			startInstall();
			copyFiles();
		}catch(SpaceException e){
			System.err.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();
		}catch(MemoryException ex){
			System.err.println("에러 메시지 : "+ex.getMessage());
			ex.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		}finally{
			deleteTempFile();
		}
	}

	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
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





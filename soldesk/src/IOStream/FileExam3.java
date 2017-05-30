package IOStream;

import java.io.*;

public class FileExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 삭제
		{
			File file = new File("d:/example/test.txt");
			
			if( !file.delete() ){
				System.out.println("파일을 삭제하지 못했습니다.");
			}else
			{
				System.out.println("파일을 삭제했습니다.");
			}
		}
		
		// 디렉토리 삭제
		{
			File file = new File("d:/example/filefolder");
			
//			if( !file.delete() ){
//				System.out.println("디렉토리를 삭제하지 못했습니다.");
//			}
			
			deleteDirectory(file);
		}
	}
	
	private static void deleteDirectory(File dir){
		for(File file : dir.listFiles()){
			if(file.isDirectory()){
				deleteDirectory(file);	// 메소드의 재귀호출
			}else{
				file.delete();
			}
		}
		
		dir.delete();
	}

}








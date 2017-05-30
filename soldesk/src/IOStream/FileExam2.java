package IOStream;

import java.io.*;

public class FileExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			File file = new File("src/IOStream/FileCopyTest.java");
			
			if(file.exists()){
				System.out.println("파일이 존재합니다.");
			}else{
				System.out.println("파일이 존재하지 않습니다.");
			}
		}
		
		// FileExam.java 로 File 객체 생성한 후 파일인지 아닌지 체크해서 "~은 파일입니다." 내용 출력
		{
			File file = new File("src/IOStream/FileExam.java");
			
			if(file.isFile()){
				System.out.println(file.getName()+"은 파일입니다.");
			}
		}
		
		//IOStream 가 디렉토리인지 아닌지 체크해서 "~는 디렉토리입니다." 내용을 출력
		{
			File file = new File("src/IOStream");
			
			if(file.isDirectory()){
				System.out.println(file.getName()+"은 디렉토리입니다.");
			}
		}
	}

}







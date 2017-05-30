package IOStream;

import java.io.File;
import java.io.IOException;

public class FileExam4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File oldFile = new File("d:/example/streamTest.txt");
		
		if(oldFile.createNewFile()){
			System.out.println(oldFile.getName()+"을 작성했습니다.");
		}
		
		File newFile = new File("d:/example/readme.txt");
		if(oldFile.renameTo(newFile)){
			System.out.println(oldFile.getName()+"을 "+newFile.getName()+"로 변경했습니다.");
		}
		
	}

}








package IOStream;

import java.io.File;
import java.io.IOException;

public class FileExam4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File oldFile = new File("d:/example/streamTest.txt");
		
		if(oldFile.createNewFile()){
			System.out.println(oldFile.getName()+"�� �ۼ��߽��ϴ�.");
		}
		
		File newFile = new File("d:/example/readme.txt");
		if(oldFile.renameTo(newFile)){
			System.out.println(oldFile.getName()+"�� "+newFile.getName()+"�� �����߽��ϴ�.");
		}
		
	}

}








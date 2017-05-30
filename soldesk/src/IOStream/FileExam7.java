package IOStream;

import java.io.*;

public class FileExam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			File file = new File("c:/users/take/test.txt");
			
			String parentDirName = file.getParent();
			System.out.println(parentDirName);
		}
		
		{
			File dir = new File("lib");
			File parentDir = dir.getParentFile();
			System.out.println(parentDir);
		}
		
		{
			File dir = new File("lib");
			File absDir = dir.getAbsoluteFile();
			System.out.println(absDir);
			
			File parentDir = absDir.getParentFile();
			System.out.println(parentDir);
		}
	}

}










package IOStream;

import java.io.*;

public class FileExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			File file = new File("src/IOStream/FileCopyTest.java");
			
			if(file.exists()){
				System.out.println("������ �����մϴ�.");
			}else{
				System.out.println("������ �������� �ʽ��ϴ�.");
			}
		}
		
		// FileExam.java �� File ��ü ������ �� �������� �ƴ��� üũ�ؼ� "~�� �����Դϴ�." ���� ���
		{
			File file = new File("src/IOStream/FileExam.java");
			
			if(file.isFile()){
				System.out.println(file.getName()+"�� �����Դϴ�.");
			}
		}
		
		//IOStream �� ���丮���� �ƴ��� üũ�ؼ� "~�� ���丮�Դϴ�." ������ ���
		{
			File file = new File("src/IOStream");
			
			if(file.isDirectory()){
				System.out.println(file.getName()+"�� ���丮�Դϴ�.");
			}
		}
	}

}







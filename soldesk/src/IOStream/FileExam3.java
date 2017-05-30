package IOStream;

import java.io.*;

public class FileExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		{
			File file = new File("d:/example/test.txt");
			
			if( !file.delete() ){
				System.out.println("������ �������� ���߽��ϴ�.");
			}else
			{
				System.out.println("������ �����߽��ϴ�.");
			}
		}
		
		// ���丮 ����
		{
			File file = new File("d:/example/filefolder");
			
//			if( !file.delete() ){
//				System.out.println("���丮�� �������� ���߽��ϴ�.");
//			}
			
			deleteDirectory(file);
		}
	}
	
	private static void deleteDirectory(File dir){
		for(File file : dir.listFiles()){
			if(file.isDirectory()){
				deleteDirectory(file);	// �޼ҵ��� ���ȣ��
			}else{
				file.delete();
			}
		}
		
		dir.delete();
	}

}








package IOStream;

import java.io.*;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:/example/filefolder/sample.txt");
		
		if(file.exists()){
			try{
				System.out.println("getName : "+file.getName());
				System.out.println("getPath : "+file.getPath());
				System.out.println("getAbsolutePath : " + file.getAbsolutePath());
				System.out.println("getCanonicalPath : "+file.getCanonicalPath());
				System.out.println("getParent : "+file.getParent());
				
				// ������ �Ӽ� �˾ƺ���
				if(file.canWrite()) 
					System.out.println(file.getName()+"�� �� �� �ֽ��ϴ�.");
				if(file.canRead())
					System.out.println(file.getName()+"�� ���� �� �ֽ��ϴ�.");
				
				// ��ü�� ���� �Ǵ� ���� ���� üũ
				if(file.isFile()){
					System.out.println(file.getName()+"�� �����Դϴ�.");
				}else if(file.isDirectory()){
					System.out.println(file.getName()+"�� �����Դϴ�.");
				}else{
					System.out.println(file.getName()+"�� ���ϵ� ������ �ƴմϴ�.");
				}
				
				System.out.println(file.getName()+"�� ���̴� "+file.length()+" �Դϴ�.");
			}catch(IOException e){
				System.err.println(e);
			}
		}else{
			System.out.println("������ ã�� �� �����ϴ�.");
		}
	}

}









package IOStream;

import java.io.*;

public class FileExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// d:/example/FileCopyTest.txt ������ �Ӽ��� ���ϱ�
		// ��µ� �Ӽ��� : �б� ����, ���� ����, ���డ�� ���� ��/���� �������� �ƴ��� ���ϱ�
		File file = new File("d:/example/FileCopyTest.txt");
		System.out.println("���丮? "+file.isDirectory());
		System.out.println("�����̴�? "+file.isFile());
		System.out.println("�б� ����? "+file.canRead());
		System.out.println("���� ����? "+file.canWrite());
		System.out.println("���� ����? "+file.canExecute());
		System.out.println("���� ����? "+file.isHidden());
		
		// ���� ���󼭴� �б�, ����, ���� ������ ���Ϸ� ���� ����
		file.setReadable(true);
		file.setWritable(true);
		file.setExecutable(true);
		
		File file2 = new File("src");
		System.out.println(file2);
		
		String absPath = file2.getAbsolutePath();
		System.out.println(absPath);
	}

}







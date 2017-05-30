package IOStream;

import java.io.*;

/*
 * System.out�� ��´���� test.txt ���Ϸ� �����ؼ� ����ϴ� ���α׷�.
 */
public class StandardIOExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fs = null;
		
		try{
			fs = new FileOutputStream("d:/example/test.txt");
			ps = new PrintStream(fs);
			System.setOut(ps);
		}catch(FileNotFoundException e){
			System.err.println("File not found");		
		}
		
		System.out.println("Hello by System.out");
		System.out.println("Hello by System.err");

	}

}








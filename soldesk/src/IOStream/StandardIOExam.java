package IOStream;

import java.io.*;

/*
 * System.out의 출력대상을 test.txt 파일로 변경해서 출력하는 프로그램.
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








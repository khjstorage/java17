package IOStream;

import java.io.*;

public class FileExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// d:/example/FileCopyTest.txt 파일의 속성값 구하기
		// 출력될 속성값 : 읽기 가능, 쓰기 가능, 실행가능 여부 값/숨은 파일인지 아닌지 구하기
		File file = new File("d:/example/FileCopyTest.txt");
		System.out.println("디렉토리? "+file.isDirectory());
		System.out.println("파일이니? "+file.isFile());
		System.out.println("읽기 가능? "+file.canRead());
		System.out.println("쓰기 가능? "+file.canWrite());
		System.out.println("실행 가능? "+file.canExecute());
		System.out.println("숨김 파일? "+file.isHidden());
		
		// 때에 따라서는 읽기, 쓰기, 실행 가능한 파일로 설정 가능
		file.setReadable(true);
		file.setWritable(true);
		file.setExecutable(true);
		
		File file2 = new File("src");
		System.out.println(file2);
		
		String absPath = file2.getAbsolutePath();
		System.out.println(absPath);
	}

}







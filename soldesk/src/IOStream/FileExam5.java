package IOStream;

import java.io.*;
import java.util.*;

public class FileExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			File file = new File("src/IOStream/FileExam2.java");
			long size = file.length();
			System.out.println(size);
		}
		{
			File dir = new File("src/IOStream");
			long size = dir.length();
			System.out.println("디렉토리 길이 : "+size);
		}
		{
			File file = new File("src/IOStream/BufferedReaderEx.java");
			long time = file.lastModified();
			Date date = new Date(time);	// 최종 수정된 일시를 Date Object로 변환
			System.out.println("date : "+date);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);		
			
			file.setLastModified(System.currentTimeMillis());
		}
	}

}









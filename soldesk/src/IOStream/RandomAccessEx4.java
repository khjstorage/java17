package IOStream;

import java.io.*;

public class RandomAccessEx4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("d:/example/test.dat");
		
		RandomAccessFile rndAccessFile = new RandomAccessFile(file, "rw");
		
		rndAccessFile.seek(3);
		byte b = rndAccessFile.readByte();
		System.out.println((char)b);
		
		byte[] bytes = new byte[2];
		rndAccessFile.read(bytes);
		System.out.println(new String(bytes));
		
		rndAccessFile.seek(1);
		rndAccessFile.write("012".getBytes());
	}

}








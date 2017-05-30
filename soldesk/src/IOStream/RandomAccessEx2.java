package IOStream;

import java.io.*;

public class RandomAccessEx2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		double[] data = {2.3, 3.2, 5.8, 9.9, 10.2, 12.6, 18.4, 22.2, 29.8, 110.52};
		
		RandomAccessFile ref = new RandomAccessFile("d:/example/test3.txt", "rw");
		
		for(int i=0; i<data.length;i++){
			ref.writeDouble(data[i]);
		}
		
		ref.seek(8);
		System.out.println(ref.readDouble());
		
		ref.seek(0);
		System.out.println(ref.readDouble());
		
		ref.seek(8*3);
		System.out.println(ref.readDouble());

	}

}









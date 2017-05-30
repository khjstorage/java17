package IOStream;

import java.io.*;
import java.util.*;

class ByteArrayInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buffer = new byte[10];
		Random rnd = new Random();
		
		for(int i=0;i<buffer.length;i++){
			buffer[i] = (byte)rnd.nextInt();
		}
		
		ByteArrayInputStream b = new ByteArrayInputStream(buffer);
		
		System.out.println("All the elements in the buffer:");
		
		int num;
		while( (num = b.read()) !=-1 ){
			System.out.print(num+", ");
		}
	}

}










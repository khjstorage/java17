package IOStream;

import java.io.*;
import java.util.*;

public class ByteArrayInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		
		try{
			while(input.available()>0){
				input.read(temp);
				output.write(temp);
//				System.out.println("temp:" + Arrays.toString(temp));
				outSrc = output.toByteArray();
				printAll(temp, outSrc);
			}
		}catch(IOException e){}
	}
	
	static void printAll(byte[] temp, byte[] outSrc){
		System.out.println("temp : "+Arrays.toString(temp));
		System.out.println("Output Source: "+Arrays.toString(outSrc));
	}

}








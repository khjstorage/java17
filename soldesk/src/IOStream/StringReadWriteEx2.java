package IOStream;

import java.io.*;

public class StringReadWriteEx2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str = "StringRead Example Program!!";
		
		StringReader reader = new StringReader(str);
		
		int c = reader.read();
		
		while(c !=-1){
			System.out.print((char)c);
			
			c = reader.read();
		}
		
		reader.close();
	}

}





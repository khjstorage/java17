package IOStream;

import java.io.*;

public class DataStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 90, 85, 80, 75};
		
		FileOutputStream fos = null;
		DataOutputStream dos  = null;
		
		try{
			fos = new FileOutputStream("d:/example/score.dat");
			dos = new DataOutputStream(fos);
			
			for(int i=0;i<score.length;i++){
				dos.writeInt(score[i]);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			if(dos !=null) try{dos.close();}catch(Exception e){}
			if(fos != null) try{fos.close();}catch(Exception e){}
		}
	}

}









package IOStream;

import java.io.*;

public class DataStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		int sum = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("d:/example/score.dat");
			dis = new DataInputStream(fis); 
			
			while(true){
				score = dis.readInt();
				System.out.println("�о�� ����:"+score);
				sum += score;
			}
			
		}catch(EOFException e){
			System.out.println("������ ���� ���: "+sum+"�Դϴ�.");
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			if(dis != null) try{dis.close();}catch(IOException er){}
			if(fis != null) try{fis.close();}catch(IOException er){}
		}
	}

}










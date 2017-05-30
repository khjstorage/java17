package IOStream;

import java.io.*;

public class RandomAccessEx3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int seekSize = 5;
		
		RandomAccessFile rdma = new RandomAccessFile("d:/example/test2.txt", "r");
		String line = "";
		
		while( (line=rdma.readLine()) != null ){
			System.out.println(line);
		}
		
		//문자열의 총 길이
		System.out.println("total length : "+rdma.length()+"\n");
		
		byte[] data = null;
		
		// 루프 사이즈 값 구하는 식
		long size = rdma.length()/seekSize+(rdma.length()%seekSize == 0 ? 0 : 1);
		
		for(int i=0;i<size;i++){
			data = new byte[seekSize];
			
			rdma.seek(i*seekSize); // 첫번째: 0~4 위치데이타, 두번째 : 5~9 위치데이타.....
			rdma.read(data);
			
			System.out.printf("pointer : %02d str : %s \n", rdma.getFilePointer(), new String(data).trim());
		}
		
		rdma.close();
	}

}









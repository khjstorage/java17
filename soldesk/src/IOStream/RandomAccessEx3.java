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
		
		//���ڿ��� �� ����
		System.out.println("total length : "+rdma.length()+"\n");
		
		byte[] data = null;
		
		// ���� ������ �� ���ϴ� ��
		long size = rdma.length()/seekSize+(rdma.length()%seekSize == 0 ? 0 : 1);
		
		for(int i=0;i<size;i++){
			data = new byte[seekSize];
			
			rdma.seek(i*seekSize); // ù��°: 0~4 ��ġ����Ÿ, �ι�° : 5~9 ��ġ����Ÿ.....
			rdma.read(data);
			
			System.out.printf("pointer : %02d str : %s \n", rdma.getFilePointer(), new String(data).trim());
		}
		
		rdma.close();
	}

}









package IOStream;

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �������ּ���.");
		
		try{
			String name = reader.readLine();
			System.out.println("�ȳ��ϼ���. "+name+"��!!! �ݰ����ϴ�.");
		}catch(IOException er){
			er.printStackTrace();
		}
		
	}

}

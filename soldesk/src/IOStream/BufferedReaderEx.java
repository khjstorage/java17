package IOStream;

import java.io.*;
import java.util.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.print("�̸� �Է� : ");
			String name = br.readLine();
			System.out.print("\n���� �Է� : ");
			String age = br.readLine();
			
			if(name.equals("��浿")){
				System.out.print("����");
			}
			
			System.out.println(name+"�� "+ age +"���Դϴ�.");
			int temp_age = Integer.parseInt(age);
			System.out.println( (Calendar.getInstance().get(Calendar.YEAR)-temp_age+1)+"����" );
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException nfe){
			System.out.println("���̴� ���ڷ� �Է����ּ���.");
		}
	}

}







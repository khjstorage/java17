package IOStream;

import java.io.*;
import java.util.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.print("이름 입력 : ");
			String name = br.readLine();
			System.out.print("\n나이 입력 : ");
			String age = br.readLine();
			
			if(name.equals("김길동")){
				System.out.print("반장");
			}
			
			System.out.println(name+"님 "+ age +"살입니다.");
			int temp_age = Integer.parseInt(age);
			System.out.println( (Calendar.getInstance().get(Calendar.YEAR)-temp_age+1)+"년대생" );
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException nfe){
			System.out.println("나이는 숫자로 입력해주세요.");
		}
	}

}







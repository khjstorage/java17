package IOStream;

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("º∫«‘¿ª ∏ªæ∏«ÿ¡÷ººø‰.");
		
		try{
			String name = reader.readLine();
			System.out.println("æ»≥Á«œººø‰. "+name+"ææ!!! π›∞©Ω¿¥œ¥Ÿ.");
		}catch(IOException er){
			er.printStackTrace();
		}
		
	}

}

package StringPattern;

import java.io.*;

public class WrapperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 값 : ");	// 454.456 3 1
			String chInputValue = in.readLine();
			String[] chArrayValue = chInputValue.split(" ");
			
			float chOrgValue = Float.parseFloat(chArrayValue[0]);
			int chDevideNum = Integer.parseInt(chArrayValue[1]);
			int chDspNum = Integer.parseInt(chArrayValue[2]);
			
			int j = 1;
			int k = 1;
			
			for(int i=1;i<=chDevideNum;i++){
				j = j*10;			// j=1000
			}
			
			for(int i=1;i<=chDspNum;i++){
				k = k*10;		// k = 10;
			}
			
			float chResultValue = Math.round(chOrgValue*j);		// 454456.0
			chResultValue = chResultValue/j;		//454.456
			
			chResultValue = Math.round(chResultValue*k);	//4545.0
			chResultValue = chResultValue/k;
			
			System.out.println("결과값 : "+ chResultValue);
					
					
		}catch(Exception ex){
			System.out.println("오류 메시지"+ex);
		}
	}

}







/*
 * 1) '>>'와 같은 문자가 나타나서 사용자의 입력을 기다리게 한다.
 * 2) 사용자가 문자를 입력하게 되면 입력한 내용을 화면에 출력
 * 3) 'q','Q'를 입력하면 프로그램이 종료되게 한다.
 *     break; 수행
 */

package javaSample;

import java.util.Scanner;

public class ConsoleEx1 {
	static String[] argArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true){
			String strPrompt = ">> ";
			System.out.print(strPrompt);
			
			String input = scan.nextLine();			
			String[] argArr = input.trim().split(" ");
			
			if(input.equalsIgnoreCase("Q")){
				System.exit(0);
//				break;
			}else{
				for(String arg : argArr){
					System.out.println(arg);
				}
			}
		}

	}

}








/*
 * 1) '>>'�� ���� ���ڰ� ��Ÿ���� ������� �Է��� ��ٸ��� �Ѵ�.
 * 2) ����ڰ� ���ڸ� �Է��ϰ� �Ǹ� �Է��� ������ ȭ�鿡 ���
 * 3) 'q','Q'�� �Է��ϸ� ���α׷��� ����ǰ� �Ѵ�.
 *     break; ����
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








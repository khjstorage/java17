package javaSample;

import java.util.Scanner;

public class QuizEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {
				"���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public",
				"���� �� �ڹ��� �����ڰ� �ƴ� ����?`6`&`|`++`!=`/`^",
				"���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false"
		};
		
		Scanner s = new Scanner(System.in);
		int score = 0;
		
		for(int i=0;i<data.length;i++){
			String[] tmp = data[i].split("`",3);
			
			String question = tmp[0];
			String answer = tmp[1];
			String[] choises = tmp[2].split("`");
			
			System.out.println("[" + (i+1) + "] " + question);
			
			for(int x=0;x<choises.length;x++){
				System.out.println((x+1)+"."+choises[x]+"\t");
			}
			System.out.println();
			
			System.out.print("[����] : ");
			
			String input = s.nextLine();
			
			if(input.equals(answer)){
				score++;
			}
			
			System.out.println();
			System.out.println();			
		}
		
		System.out.println("���䰳��/��ü���׼� : "+score+" / "+data.length);
	}

}







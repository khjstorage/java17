package javaSample;

import java.util.Scanner;

public class QuizEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {
				"다음 중 키워드가 아닌 것은?`2`final`True`if`public",
				"다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^",
				"다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false"
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
			
			System.out.print("[정답] : ");
			
			String input = s.nextLine();
			
			if(input.equals(answer)){
				score++;
			}
			
			System.out.println();
			System.out.println();			
		}
		
		System.out.println("정답개수/전체문항수 : "+score+" / "+data.length);
	}

}







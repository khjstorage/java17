package StringPattern;

import java.util.*;

public class StringTokenizerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");

		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+"|");
		
		System.out.println("count : "+result.length);
		
		int i;
		for(i=0;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");
		
		System.out.println("count : "+i);
	}

}






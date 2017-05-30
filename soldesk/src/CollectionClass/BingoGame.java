package CollectionClass;

import java.util.*;

public class BingoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		int[][] borad = new int[5][5];
		
		for(int i=0;set.size()<25;i++){
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0;i<borad.length;i++){
			for(int j=0;j<borad[i].length;j++){
				borad[i][j] = Integer.parseInt((String)it.next());
				System.out.print( (borad[i][j] <10 ? "   " : " ") + borad[i][j] );
			}
			System.out.println();
		}
	}

}









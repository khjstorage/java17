package CollectionClass;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man[] mans = {
			new Man("Sunny", 20), new Man("Tom", 8), new Man("Joy", 12),
			new Man("Jack", 40), new Man("Soldesk", 10)
		};
		
		System.out.println("####Before Sort###");		// 정렬전
		print(mans);
		
		Arrays.sort(mans);
		System.out.println("###After Sort###");   //정렬 후
		print(mans);
		
	}
	
	public static void print(Man[] mans){
		for(int i=0;i<mans.length;i++){
			System.out.println(mans[i]);
		}
	}

}









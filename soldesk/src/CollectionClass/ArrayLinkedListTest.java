package CollectionClass;

import java.util.*;

public class ArrayLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(2000000);
		LinkedList il = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArryaList : "+add1(al));
		System.out.println("LinkedList : "+add1(il));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArryaList : "+add2(al));
		System.out.println("LinkedList : "+add2(il));
		System.out.println();
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArryaList : "+remove2(al));
		System.out.println("LinkedList : "+remove2(il));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArryaList : "+remove1(al));
		System.out.println("LinkedList : "+remove1(il));
		System.out.println();
		
	}
	
	public static long add1(List list){
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i++){
			list.add(i+"");
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;
	}
	
	public static long add2(List list){
		long start = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++){
			list.add(500, "X");
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;
	}
	
	public static long remove1(List list){
		long start = System.currentTimeMillis();
		
		for(int i = list.size()-1;i>=0;i--)
			list.remove(i);
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long remove2(List list){
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<10000;i++)
			list.remove(i);
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}

}









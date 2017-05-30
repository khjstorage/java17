package CollectionClass;

import java.util.*;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector v = new MyVector(2);
		
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		
		Object[] objArr = v.toArray();
		for(int i=0;i<objArr.length;i++){
			System.out.println(v.get(i)+",");
		}
		System.out.println();
		
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		System.out.println("isEmpty:"+v.isEmpty());
		System.out.println(v.contains("BBB"));
		System.out.println();
		
		v.remove(1);
		v.remove("CCC");
		System.out.println(v);
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		System.out.println("isEmpty:"+v.isEmpty());
		
		v.clear();
		System.out.println(v);
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		System.out.println("isEmpty:"+v.isEmpty());
	}

}















package CollectionClass;

import java.util.*;

public class CompareListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MiniVo> list = new ArrayList<MiniVo>();
		
		MiniVo min1 = new MiniVo();
		min1.setVolume("10");
		min1.setName("AA");
		list.add(min1);
		
		MiniVo min2 = new MiniVo();
		min2.setVolume("1");
		min2.setName("BB");
		list.add(min2);
		
		MiniVo min3 = new MiniVo();
		min3.setVolume("100");
		min3.setName("CC");
		list.add(min3);
		
		System.out.println("=======Before order========");
		for(int i=0;i<list.size();i++){
			MiniVo stock = list.get(i);
			System.out.println(stock.getName()+" : "+stock.getVolume());
		}
		
		MiniComparator comp = new MiniComparator();
		Collections.sort(list, comp);
		
		System.out.println("=======After order========");
		for(int i=0;i<list.size();i++){
			MiniVo stock = list.get(i);
			System.out.println(stock.getName()+" : "+stock.getVolume());
		}
	}

}







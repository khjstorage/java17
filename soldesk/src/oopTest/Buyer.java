package oopTest;

import java.util.Vector;

public class Buyer {
	int money= 1000;
	int bonusPoint = 0;
	//구입한 제품을 저장하기 위한 배열
//	AProduct[] item = new AProduct[10];
//	int i =0;
	Vector item = new Vector();
	
	void buy(AProduct p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수가 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
//		item[i++] = p;
		item.add(p);
		
		System.out.println(p+"을 구입하셨습니다.");
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()){
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 일반 배열 메모리 선언시 사용
//		for(int i=0;i<item.length;i++){
//			if(item[i]==null) break;
//			
//			sum +=item[i].price;
//			itemList +=item[i]+", ";
//		}
		
		for(int i=0;i<item.size();i++)
		{
			AProduct p = (AProduct)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", "+p;
		}
		System.out.println("구입하신 물품의 총금액은 "+ sum + "만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList+"입니다.");
	}
	
	void refund(AProduct p){
		if(item.remove(p)){
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			
			System.out.println(p+"을 반품하셨습니다.");
		}else{
			System.out.println("구입하신 제품이 없습니다.");	
			return;
		}
	}
}






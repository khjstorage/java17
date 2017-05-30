package oopTest;

import java.util.Vector;

public class Buyer {
	int money= 1000;
	int bonusPoint = 0;
	//������ ��ǰ�� �����ϱ� ���� �迭
//	AProduct[] item = new AProduct[10];
//	int i =0;
	Vector item = new Vector();
	
	void buy(AProduct p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� ���� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
//		item[i++] = p;
		item.add(p);
		
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()){
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		// �Ϲ� �迭 �޸� ����� ���
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
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+ sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList+"�Դϴ�.");
	}
	
	void refund(AProduct p){
		if(item.remove(p)){
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else{
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");	
			return;
		}
	}
}






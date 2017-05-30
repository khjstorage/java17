package oopTest;

public class AProduct {
	int price;
	int bonusPoint;
	
	AProduct(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	AProduct(){
		price = 0;
		bonusPoint = 0;
	}
}

package javaSample;

import java.util.Scanner;

class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int paperRest = 10;
		
		int inkRest = 100;
		int tonerRest = 100;
		
		while(true){
			Print p = new Print();
			InkPrint l = new InkPrint();
			RazerPrint r = new RazerPrint();
			Scanner rd = new Scanner(System.in);
			
			System.out.print("모델명 >> ");
			p.modelName = rd.nextLine();
			
			System.out.print("제조사 >> ");
			p.productor = rd.nextLine();
			
			System.out.print("인터페이스 종류 >> ");
			p.kindoInterface = rd.nextLine();
			
			System.out.print("인쇄 매수 >> ");
			p.printNum = rd.nextInt();
			
			System.out.print("잉크젯 프린터 - 1 / 레이저 프린터 - 2 >>");
			int menu = rd.nextInt();
			
			switch(menu){
			case 1:
				paperRest -= p.printNum;
				inkRest -= p.printNum *10;
				l.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("종이 잔량 : "+paperRest);
				System.out.println("잉크 잔량 : "+inkRest);
				break;
			case 2:
				paperRest -= p.printNum;
				tonerRest -= p.printNum *10;
				r.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("종이 잔량 : "+paperRest);
				System.out.println("토너 잔량 : "+tonerRest);
				break;
			default:
				paperRest -= p.printNum;
				p.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("종이 잔량 : "+paperRest);
				break;
			}
			
			System.out.print("다시 출력하시겠습니까? (y/n) >> ");
			String sel = rd.next();
			
			if(sel.equalsIgnoreCase("n")){
				System.out.println("종료하겠습니다.");
				break;
			}
			
		}
	}

}






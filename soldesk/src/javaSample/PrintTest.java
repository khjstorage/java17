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
			
			System.out.print("�𵨸� >> ");
			p.modelName = rd.nextLine();
			
			System.out.print("������ >> ");
			p.productor = rd.nextLine();
			
			System.out.print("�������̽� ���� >> ");
			p.kindoInterface = rd.nextLine();
			
			System.out.print("�μ� �ż� >> ");
			p.printNum = rd.nextInt();
			
			System.out.print("��ũ�� ������ - 1 / ������ ������ - 2 >>");
			int menu = rd.nextInt();
			
			switch(menu){
			case 1:
				paperRest -= p.printNum;
				inkRest -= p.printNum *10;
				l.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("���� �ܷ� : "+paperRest);
				System.out.println("��ũ �ܷ� : "+inkRest);
				break;
			case 2:
				paperRest -= p.printNum;
				tonerRest -= p.printNum *10;
				r.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("���� �ܷ� : "+paperRest);
				System.out.println("��� �ܷ� : "+tonerRest);
				break;
			default:
				paperRest -= p.printNum;
				p.print(p.modelName, p.productor, p.kindoInterface, p.printNum);
				System.out.println("���� �ܷ� : "+paperRest);
				break;
			}
			
			System.out.print("�ٽ� ����Ͻðڽ��ϱ�? (y/n) >> ");
			String sel = rd.next();
			
			if(sel.equalsIgnoreCase("n")){
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			}
			
		}
	}

}






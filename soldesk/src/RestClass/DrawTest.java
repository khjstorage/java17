package RestClass;

import java.util.Scanner;

class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		DrawMenu m = new DrawMenu();
		
		while(true){
			Scanner rd = new Scanner(System.in);
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4) >> ");
			
			int choice = rd.nextInt();
			switch(choice){
			case 1:
				m.Insert(i);
				i++;
				break;
			case 2:
				m.Delete();
				break;
			case 3:
				m.View();
				break;
			case 4:
				m.Exit();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}




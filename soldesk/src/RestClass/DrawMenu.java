package RestClass;

import java.util.Scanner;

class DrawMenu {
	int i;
	Scanner rd = new Scanner(System.in);
	Figure f[] = new Figure[10];
	
	public DrawMenu(){
		for(int i=0;i<f.length;i++)
			f[i] = new Figure();
	}
	
	void Insert(int i){
		System.out.println("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int num = rd.nextInt();
		
		switch(num){
		case 1:
			f[i].type = "Line";
			break;
		case 2:
			f[i].type = "Rect";
			break;
		case 3:
			f[i].type = "Circle";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	void Delete(){
		System.out.println("삭제할 도형의 위치는 >> ");
		int num = rd.nextInt();
		
		if(f[num-1].type.equals("")){
			System.out.println("삭제할 수 없습니다.");
		}
		
		f[num-1].type = "";
	}
	
	void View(){
		int i;
		
		for(i=0;i<f.length;i++){
			if(f[i].equals("")){}
			else
				f[i].draw();
		}
	}
	
	void Exit(){
		System.exit(0);
	}
}




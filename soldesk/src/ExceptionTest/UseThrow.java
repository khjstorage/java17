package ExceptionTest;

import java.util.Random;

public class UseThrow {
	
	public String ducksu() throws Exception{
		String result = "";
		int classGrade = new Random().nextInt(3);
		System.out.println("classGrade�� : "+classGrade);
		String[] gradeTitle = {"�ߵ�", "���", "���"};
		result = gradeTitle[classGrade]+"����.... ������ ��������.";
		
		if(classGrade==2){
			throw new Exception(gradeTitle[classGrade]+"�� �ǰ��� ì�⼼��.");
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThrow ut = new UseThrow();
		
		try{
			String msg = ut.ducksu();
			System.out.println(msg);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}




package ExceptionTest;

import java.util.Random;

public class UseThrow {
	
	public String ducksu() throws Exception{
		String result = "";
		int classGrade = new Random().nextInt(3);
		System.out.println("classGrade값 : "+classGrade);
		String[] gradeTitle = {"중딩", "고딩", "대딩"};
		result = gradeTitle[classGrade]+"흡연중.... 빠르게 지나간다.";
		
		if(classGrade==2){
			throw new Exception(gradeTitle[classGrade]+"님 건강을 챙기세요.");
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




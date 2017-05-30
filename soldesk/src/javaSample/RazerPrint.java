package javaSample;

class RazerPrint extends Print {
	public RazerPrint(){}
	
	public void print(String a, String b, String c, int num){
		System.out.println("모델명 : "+ a +" / 제조사 : "+ b +
				" / 인터페이스 종류 : "+ c + " / 인쇄 매수 : "+ num);
	}
}

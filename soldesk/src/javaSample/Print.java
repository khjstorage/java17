package javaSample;

class Print {
	String modelName;
	String productor;
	String kindoInterface;
	int printNum;
	
	public Print(){}
	
	public Print(String a, String b, String c, int num){
		this.modelName = a;
		this.productor = b;
		this.kindoInterface = c;
		this.printNum = num;
	}
	
	public void print(String a, String b, String c, int num){
		System.out.println("모델명 : "+ a +" / 제조사 : "+ b +
				" / 인터페이스 종류 : "+ c + " / 인쇄 매수 : "+ num);
	}
}



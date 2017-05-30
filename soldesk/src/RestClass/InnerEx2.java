package RestClass;

class Outer2{
	int value =10;
	
	class Inner2{
		int value = 20;
		
		void method1(){
			int value = 30;
			System.out.println("            value : "+value);
			System.out.println("       this.value : "+this.value);
			System.out.println("Outer.this.value : "+Outer2.this.value);
		}
	}//Inner2 end
}//Outer2 end

class InnerEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer = new Outer2();
		Outer2.Inner2 inner = outer.new Inner2();
				
		inner.method1();
	}

}




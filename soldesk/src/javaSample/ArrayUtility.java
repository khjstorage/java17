package javaSample;

class ArrayUtility {
	static double[] intToDouble(int[] source){
		double[] resource =new double[source.length];
		
		for(int i=0;i<source.length; i++){
			resource[i] = (double)source[i];
		}//for end
		
		return resource;
	}
	
	static int[] doubleToInt(double[] source){
		int[] resource = new int[source.length];
		
		for(int i=0; i<source.length;i++){
			resource[i] = (int)source[i];
		}
		
		return resource;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1, 2, 3, 4, 5};
		double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		int[] newInt = new int[doubleArray.length];
		double[] newDouble = new double[intArray.length];
		
		newDouble= intToDouble(intArray);
		newInt = doubleToInt(doubleArray);
		
		System.out.println("정수 -> 실수");
		for(int i=0;i<intArray.length;i++){
			System.out.print(intArray[i] + " ⇒ ");
			System.out.println(newDouble[i]);
		}
		
		System.out.println();
		
		System.out.println("실수 -> 정수");
		for(int i=0;i<doubleArray.length;i++){
			System.out.print(doubleArray[i] + " ⇒ ");
			System.out.println(newInt[i]);
		}
	}

}

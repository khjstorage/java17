package javaSample;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"A","B","C"};
		System.out.println(stringArray.length);
		
		String[] array = {"a","b"};
		
		System.out.println("선두요소="+ array[0]);
		
		if(array.length>0){
			System.out.println("앞 부분의 요소="+array[0]);
		}
	}

}

package ExceptionTest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "apple";
		String str2 = "apple";
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		printResult(str1==str2);
		printResult(str2==str3);
		printResult(str3==str4);
		
		printResult(str2.equalsIgnoreCase(str3));
		printResult(str2.equals(str3));
		printResult(str3.equals(str4));
		
		
		str2 = str2+",사과";
		printResult(str1==str2);
	}
	
	public static void printResult(boolean result){
		if(result)
			System.out.println("같다");
		else
			System.out.println("다르다");
	}

}

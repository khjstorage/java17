package StringPattern;

public class UseStringBuffer {
	
	public void useStringBuffer(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("안녕하세요 ");
		sb.append("오늘은 ").append(5).append("월 입니다.");
		sb.insert(6, "서울시의 자랑 이순신!!!");
		System.out.println(sb);
		sb.delete(11, 14);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
	
	public void useStringBuilder(){
		StringBuilder  sb = new StringBuilder();
		
		sb.append("안녕하세요 ");
		sb.append("오늘은 ").append(5).append("월 입니다.");
		sb.insert(6, "서울시의 자랑 이순신!!!");
		System.out.println(sb);
		sb.delete(11, 14);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseStringBuffer usb = new UseStringBuffer();
		
		usb.useStringBuffer();
		System.out.println("===========================================");
		usb.useStringBuilder();
	}

}






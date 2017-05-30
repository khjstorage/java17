package StringPattern;

public class UseStringBuffer {
	
	public void useStringBuffer(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("�ȳ��ϼ��� ");
		sb.append("������ ").append(5).append("�� �Դϴ�.");
		sb.insert(6, "������� �ڶ� �̼���!!!");
		System.out.println(sb);
		sb.delete(11, 14);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
	
	public void useStringBuilder(){
		StringBuilder  sb = new StringBuilder();
		
		sb.append("�ȳ��ϼ��� ");
		sb.append("������ ").append(5).append("�� �Դϴ�.");
		sb.insert(6, "������� �ڶ� �̼���!!!");
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






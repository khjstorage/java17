package NetworkTest;

import java.net.*;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		//URL ��ü ����
		URL url = new URL("https://serach.naver.com:7777/serach.naver?query=java");
		
		System.out.println("Protocol : "+url.getProtocol());
		System.out.println("ȣ��Ʈ�� : "+url.getHost());
		System.out.println("��Ʈ��ȣ : "+url.getPort());
		System.out.println("�����̸� : "+url.getFile());
		System.out.println("��θ� : "+url.getPath());
		System.out.println("���� ���ڿ� : "+url.getQuery());
	}

}













package NetworkTest;

import java.net.*;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		//URL 객체 생성
		URL url = new URL("https://serach.naver.com:7777/serach.naver?query=java");
		
		System.out.println("Protocol : "+url.getProtocol());
		System.out.println("호스트명 : "+url.getHost());
		System.out.println("포트번호 : "+url.getPort());
		System.out.println("파일이름 : "+url.getFile());
		System.out.println("경로명 : "+url.getPath());
		System.out.println("쿼리 문자열 : "+url.getQuery());
	}

}













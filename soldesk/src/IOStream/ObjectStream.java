package IOStream;

import java.io.*;

public class ObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ObjectOutputStream을 이용한 객체 파일 저장
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//UserClass로 객체 생성
		UserClass us1 = new UserClass("하이언", 30);
		UserClass us2 = new UserClass("스티브", 40);
		UserClass us3 = new UserClass("제이슨", 27);
		
		try{
			fos = new FileOutputStream("d:/example/object.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(us1);
			oos.writeObject(us2);
			oos.writeObject(us3);
			
			System.out.println("객체를 저장했습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null) try{fos.close();}catch(IOException e){}
			if(oos!=null) try{oos.close();}catch(IOException e){}
		}
		
		// 파일로부터 객체 데이터를 읽어오기
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fis = new FileInputStream("d:/example/object.dat");
			ois = new ObjectInputStream(fis);
			
			System.out.println((UserClass)ois.readObject());
			System.out.println((UserClass)ois.readObject());
			System.out.println((UserClass)ois.readObject());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fis!=null) try{fis.close();}catch(IOException e){}
			if(ois!=null) try{ois.close();}catch(IOException e){}
		}
	}

}










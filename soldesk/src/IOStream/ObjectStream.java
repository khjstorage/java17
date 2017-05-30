package IOStream;

import java.io.*;

public class ObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ObjectOutputStream�� �̿��� ��ü ���� ����
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//UserClass�� ��ü ����
		UserClass us1 = new UserClass("���̾�", 30);
		UserClass us2 = new UserClass("��Ƽ��", 40);
		UserClass us3 = new UserClass("���̽�", 27);
		
		try{
			fos = new FileOutputStream("d:/example/object.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(us1);
			oos.writeObject(us2);
			oos.writeObject(us3);
			
			System.out.println("��ü�� �����߽��ϴ�.");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null) try{fos.close();}catch(IOException e){}
			if(oos!=null) try{oos.close();}catch(IOException e){}
		}
		
		// ���Ϸκ��� ��ü �����͸� �о����
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










package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object.txt 파일을 만들어서 그 파일안에 emp 객체를 저장한 후 저장된 데이타를 읽어오기
		Emp emp = new Emp();
		emp.setDepartment("A상사");
		emp.setEmp_name("Andrew");
		emp.setEmp_no(1);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos = new FileOutputStream("d:/example/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null) try{fos.close();}catch(Exception e){}
			if(oos != null) try{oos.close();}catch(Exception e){}
		}
		
		ObjectInputStream ois = null;
		
		try{
			ois = new ObjectInputStream(new FileInputStream("d:/example/object.txt"));
					
			System.out.println("====================================");
			System.out.println((Emp)ois.readObject());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ois != null) try{ois.close();}catch(Exception e){}
		}
	}

}










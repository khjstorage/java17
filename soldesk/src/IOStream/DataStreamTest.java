package IOStream;

import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fos = new FileOutputStream("d:/example/streamFile.out");
			dos = new DataOutputStream(fos);
			
			dos.writeBoolean(false);
			dos.writeByte(Byte.MAX_VALUE);
			dos.writeChar('±Â');
			dos.writeDouble(Double.MAX_VALUE);
			dos.writeFloat(Float.MAX_VALUE);
			dos.writeLong(Long.MAX_VALUE);
			dos.writeShort(Short.MAX_VALUE);
			dos.writeUTF("¾È³çÇÏ¼¼¿ä.");
			
			fis = new FileInputStream("d:/example/streamFile.out");
			dis = new DataInputStream(fis);
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readLong());
			System.out.println(dis.readShort());
			System.out.println(dis.readUTF());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(dis != null) try{dis.close();}catch(IOException e){}
			if(fis != null) try{fis.close();}catch(IOException e){}
			if(dos != null) try{dos.close();}catch(IOException e){}
			if(fos != null) try{fos.close();}catch(IOException e){}
			
		}
	}

}








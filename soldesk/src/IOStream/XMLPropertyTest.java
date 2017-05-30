package IOStream;

import java.io.*;
import java.util.Properties;

public class XMLPropertyTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//XML ������ ������Ƽ ���� �б�
		{
			try( FileInputStream in = new FileInputStream("d:/example/sample.xml") ){
				Properties properties = new Properties();
				
				properties.loadFromXML(in);
				
				System.out.println("JDBC ����̹�="+properties.getProperty("jdbc.driver"));
				System.out.println("URL="+properties.getProperty("jdbc.url"));
				System.out.println("�����="+properties.getProperty("jdbc.user"));
				System.out.println("��й�ȣ="+properties.getProperty("jdbc.password"));
			}
		}
		
		// XML �������� ������Ƽ ���� ����
		{
			try( OutputStream out = new FileOutputStream("d:/example/sample2.xml") ){
				Properties properties = new Properties();
				properties.setProperty("jdbc.driver", "org.h2.Dirver");
				properties.setProperty("jdbc.url", "jdbc:h2:mem:mydb:DB_CLOSE_DISPLY=-1");
				properties.setProperty("jdbc.user", "user_le");
				properties.setProperty("jdbc.password", "pws");
				
				properties.storeToXML(out, "JDBC Configuration");
			}
		}
	}

}













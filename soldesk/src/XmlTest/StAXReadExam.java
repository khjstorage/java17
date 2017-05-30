package XmlTest;

import javax.xml.stream.*;

import java.io.*;

public class StAXReadExam {

	public static void main(String[] args) throws IOException, XMLStreamException{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("d:/example/xmlDoc/sample3.xml");
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		
		// �Ľ� ����
		while(reader.hasNext()){
			//�̺�Ʈ(��) Ÿ�� ������
			switch(reader.getEventType()){
			case XMLStreamConstants.START_ELEMENT:
				if(reader.getLocalName().equals("book")){
					System.out.println("������ : "+reader.getAttributeValue("", "name"));
					System.out.println("���ǻ� :" +reader.getAttributeValue("", "publisher"));
				}else if(reader.getLocalName().equals("author")){
					System.out.println("���� : "+reader.getAttributeValue("", "name"));
				}
				break;
			default:
			}
			
			//Ŀ�� ����� �̿��� ���� �̺�Ʈ(��) �̵�
			reader.next();
		}
		
		reader.close();
	}

}













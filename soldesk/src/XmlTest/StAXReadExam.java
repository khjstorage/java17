package XmlTest;

import javax.xml.stream.*;

import java.io.*;

public class StAXReadExam {

	public static void main(String[] args) throws IOException, XMLStreamException{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("d:/example/xmlDoc/sample3.xml");
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		
		// 파싱 시작
		while(reader.hasNext()){
			//이벤트(줄) 타입 따지기
			switch(reader.getEventType()){
			case XMLStreamConstants.START_ELEMENT:
				if(reader.getLocalName().equals("book")){
					System.out.println("도서명 : "+reader.getAttributeValue("", "name"));
					System.out.println("출판사 :" +reader.getAttributeValue("", "publisher"));
				}else if(reader.getLocalName().equals("author")){
					System.out.println("저자 : "+reader.getAttributeValue("", "name"));
				}
				break;
			default:
			}
			
			//커서 방식을 이용해 다음 이벤트(줄) 이동
			reader.next();
		}
		
		reader.close();
	}

}













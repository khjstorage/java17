package XmlTest;

import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;

public class DOMReadExam {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		// TODO Auto-generated method stub
		
		// XML 문서 파싱
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docuBuilder = factory.newDocumentBuilder();
		Document document = docuBuilder.parse("d:/example/xmlDoc/sample.xml");
		
		//루트 요소 구하기
		Element root = document.getDocumentElement();
		
		//루트 요소 속성을 이용해 값을 구하기
		System.out.println("도서명:"+ root.getAttribute("name"));
		System.out.println("출판사:"+root.getAttribute("publisher"));
		
		//루트 요소의 자식노드 구하기
		NodeList children = root.getChildNodes();
		
		for(int i=0; i<children.getLength();i++){
			Node node = children.item(i);
			// 노드 종류를 판단하는 작업
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element = (Element) node;
				if(element.getNodeName().equals("author")){
					System.out.println("저자:"+element.getAttribute("name"));
				}
			}
		}
				
	}

}













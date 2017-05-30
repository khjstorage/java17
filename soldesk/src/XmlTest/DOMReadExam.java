package XmlTest;

import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;

public class DOMReadExam {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		// TODO Auto-generated method stub
		
		// XML ���� �Ľ�
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docuBuilder = factory.newDocumentBuilder();
		Document document = docuBuilder.parse("d:/example/xmlDoc/sample.xml");
		
		//��Ʈ ��� ���ϱ�
		Element root = document.getDocumentElement();
		
		//��Ʈ ��� �Ӽ��� �̿��� ���� ���ϱ�
		System.out.println("������:"+ root.getAttribute("name"));
		System.out.println("���ǻ�:"+root.getAttribute("publisher"));
		
		//��Ʈ ����� �ڽĳ�� ���ϱ�
		NodeList children = root.getChildNodes();
		
		for(int i=0; i<children.getLength();i++){
			Node node = children.item(i);
			// ��� ������ �Ǵ��ϴ� �۾�
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element = (Element) node;
				if(element.getNodeName().equals("author")){
					System.out.println("����:"+element.getAttribute("name"));
				}
			}
		}
				
	}

}













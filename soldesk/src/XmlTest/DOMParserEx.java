package XmlTest;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOMParserEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = null;
			xmlDoc = parser.parse("d:/example/xmlDoc/book.xml");
			
			// ��Ʈ ������Ʈ ����
			Element  root = xmlDoc.getDocumentElement();
			System.out.println("root :" +root.getTagName());
			
			// ���� ������Ʈ ����
			NodeList n1 = root.getElementsByTagName("book");
			Node bookNode = n1.item(0);
			Element bookElement = (Element)bookNode;
			
			// ���� ������Ʈ�� book�� isbn �Ӽ� �� ����
			String isbn = bookElement.getAttribute("isbn");
			System.out.println("isbn �Ӽ� �� : "+ isbn);
			
			// book ���� ��� �� title ���(�ؽ�Ʈ ���)�� ����
			NodeList bookN1 = bookNode.getChildNodes();
			Node titleNode = bookN1.item(1);
			Element titleElement = (Element)titleNode;
			System.out.println("title �� : "+titleElement.getTextContent());
			
			// ��ü ���
			System.out.println("--------------------------------------------------------");
			for(int i=0;i<n1.getLength();i++){
				Node bNode = n1.item(i);
				Element bElement = (Element)bNode;
				String is = bElement.getAttribute("isbn");
				String ki = bElement.getAttribute("kind");
				String title = bElement.getElementsByTagName("title").item(0).getTextContent();
				String author = bElement.getElementsByTagName("author").item(0).getTextContent();
				String price = bElement.getElementsByTagName("price").item(0).getTextContent();
				String str = String.format("%8s %10s %20s %10s %8s", is, ki, title, author, price);
				
				System.out.println(str);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}








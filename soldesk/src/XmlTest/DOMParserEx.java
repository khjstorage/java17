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
			
			// 루트 엘리먼트 접근
			Element  root = xmlDoc.getDocumentElement();
			System.out.println("root :" +root.getTagName());
			
			// 하위 엘리먼트 접근
			NodeList n1 = root.getElementsByTagName("book");
			Node bookNode = n1.item(0);
			Element bookElement = (Element)bookNode;
			
			// 하위 엘리먼트인 book의 isbn 속성 값 접근
			String isbn = bookElement.getAttribute("isbn");
			System.out.println("isbn 속성 값 : "+ isbn);
			
			// book 하위 노드 중 title 노드(텍스트 노드)에 접근
			NodeList bookN1 = bookNode.getChildNodes();
			Node titleNode = bookN1.item(1);
			Element titleElement = (Element)titleNode;
			System.out.println("title 값 : "+titleElement.getTextContent());
			
			// 전체 출력
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








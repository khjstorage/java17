package XmlTest;

import java.io.*;
import java.nio.charset.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.*;

public class DOMOperExam {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		
		// 새로운 노드 추가
		Element book = doc.createElement("book");
		book.setTextContent("Java 역방향 레시피");
		doc.appendChild(book);
		
		// 속성값 만들기
		book.setAttribute("title", "Java 책");
		book.setAttribute("publisher", "soldesk 출판사");
		
		// 속성 삭제
		book.removeAttribute("publisher");
		
		// book 노드 및에 하위노드인 Staff라는 노드 생성
		Element staff = doc.createElement("Staff");
		staff.setTextContent("강지영");
		book.appendChild(staff);
		
		staff.setAttribute("id", "1");
		
		// 문제 : author 자식노드 2개  추가해 보세요. 
		
		Element author1 = doc.createElement("author");
		author1.setTextContent("솔데스크");
		Element author2 = doc.createElement("author");
		author2.setTextContent("soldesk");
		book.appendChild(author1);
		book.appendChild(author2);
		
		printDocument(doc);

	}
	
	private static void printDocument(Document doc) throws TransformerException, IOException {
		// 콘솔로 출력할 때
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		DOMSource source = new DOMSource(doc);
//		StreamResult result = new StreamResult(out);
		// 파일로 만들어낼 때
		StreamResult result = new StreamResult(new FileOutputStream(new File("d:/example/xmlDoc/sample2.xml")));
		
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer tranformer = transFactory.newTransformer();
		tranformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tranformer.setOutputProperty(OutputKeys.INDENT, "yes");
		tranformer.transform(source, result);
		
//		System.out.println(new String(out.toByteArray(), StandardCharsets.UTF_8));
		System.out.println("xml 파일이 생성되었습니다.");
	}

}











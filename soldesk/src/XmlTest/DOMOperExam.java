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
		
		// ���ο� ��� �߰�
		Element book = doc.createElement("book");
		book.setTextContent("Java ������ ������");
		doc.appendChild(book);
		
		// �Ӽ��� �����
		book.setAttribute("title", "Java å");
		book.setAttribute("publisher", "soldesk ���ǻ�");
		
		// �Ӽ� ����
		book.removeAttribute("publisher");
		
		// book ��� �׿� ��������� Staff��� ��� ����
		Element staff = doc.createElement("Staff");
		staff.setTextContent("������");
		book.appendChild(staff);
		
		staff.setAttribute("id", "1");
		
		// ���� : author �ڽĳ�� 2��  �߰��� ������. 
		
		Element author1 = doc.createElement("author");
		author1.setTextContent("�ֵ���ũ");
		Element author2 = doc.createElement("author");
		author2.setTextContent("soldesk");
		book.appendChild(author1);
		book.appendChild(author2);
		
		printDocument(doc);

	}
	
	private static void printDocument(Document doc) throws TransformerException, IOException {
		// �ַܼ� ����� ��
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		DOMSource source = new DOMSource(doc);
//		StreamResult result = new StreamResult(out);
		// ���Ϸ� ���� ��
		StreamResult result = new StreamResult(new FileOutputStream(new File("d:/example/xmlDoc/sample2.xml")));
		
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer tranformer = transFactory.newTransformer();
		tranformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tranformer.setOutputProperty(OutputKeys.INDENT, "yes");
		tranformer.transform(source, result);
		
//		System.out.println(new String(out.toByteArray(), StandardCharsets.UTF_8));
		System.out.println("xml ������ �����Ǿ����ϴ�.");
	}

}











package XmlTest;

import java.io.*;

import javax.xml.stream.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

public class StAXWriteExam {

	public static void main(String[] args) throws XMLStreamException, IOException{
		// TODO Auto-generated method stub
		XMLOutputFactory outFactory = XMLOutputFactory.newInstance();
		StringWriter strWriter = new StringWriter();
		PrintWriter prnWriter = new PrintWriter(new BufferedWriter(new FileWriter("d:/example/book2.xml")));
		XMLStreamWriter writer = outFactory.createXMLStreamWriter(strWriter);
		
		// 문서를 쓰기 시작
		writer.writeStartDocument();
		// book 태그 씀
		writer.writeStartElement("book");
		writer.writeAttribute("name", "길라잡이 문서");
		writer.writeAttribute("publisher", "Soldesk");
		
		//author 태그 만들기
		writer.writeStartElement("author");
		writer.writeAttribute("name", "박실동");
		writer.writeCharacters("밖으로");		// contents값 넣기
		
		// 태그 종료 작업
		writer.writeEndElement();
		writer.writeEndElement();
		
		// 문서 종료
		writer.writeEndDocument();
		
		writer.close();
		
//		System.out.println(strWriter.toString());
		prnWriter.write(strWriter.toString());
	}

}









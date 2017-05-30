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
		
		// ������ ���� ����
		writer.writeStartDocument();
		// book �±� ��
		writer.writeStartElement("book");
		writer.writeAttribute("name", "������� ����");
		writer.writeAttribute("publisher", "Soldesk");
		
		//author �±� �����
		writer.writeStartElement("author");
		writer.writeAttribute("name", "�ڽǵ�");
		writer.writeCharacters("������");		// contents�� �ֱ�
		
		// �±� ���� �۾�
		writer.writeEndElement();
		writer.writeEndElement();
		
		// ���� ����
		writer.writeEndDocument();
		
		writer.close();
		
//		System.out.println(strWriter.toString());
		prnWriter.write(strWriter.toString());
	}

}









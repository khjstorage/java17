package XmlTest;

import java.io.*;

import javax.xml.parsers.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAXExam {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
		// TODO Auto-generated method stub
		SAXParserFactory saxParser = SAXParserFactory.newInstance();
		SAXParser parser = saxParser.newSAXParser();
		parser.parse("d:/example/xmlDoc/sample3.xml", new SampleSAXHandler());
	}
	
	public static class SampleSAXHandler extends DefaultHandler{
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attribuets) throws SAXException{
			if(qName.equals("book")){
				System.out.println("도서명:"+attribuets.getValue("name"));
				System.out.println("출판사:"+attribuets.getValue("publisher"));
			}else if(qName.equals("author")){
				System.out.println("저자:"+attribuets.getValue("name"));
			}
		}
	}

}








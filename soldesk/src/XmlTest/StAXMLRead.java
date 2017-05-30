package XmlTest;

import java.util.*;
import java.io.*;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.namespace.*;

public class StAXMLRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "d:/example/xmlDoc/employee.xml";
		List<Employee> empList = parseXML(fileName);
		
		for(Employee emp : empList){
			System.out.println(emp.toString());
		}
	}
	
	private static List<Employee> parseXML(String fileName){
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = null;
		XMLInputFactory xmlinFactory  = XMLInputFactory.newInstance();
		
		try{
			XMLEventReader xmlEventReader = xmlinFactory.createXMLEventReader(new FileInputStream(fileName));
			
			while(xmlEventReader.hasNext()){
				XMLEvent xmlEvent = xmlEventReader.nextEvent();
				if(xmlEvent.isStartElement()){
					StartElement startElement = xmlEvent.asStartElement();	// element 값 가져오기
					if(startElement.getName().getLocalPart().equals("Employee")){
						emp = new Employee();
						
						Attribute idAttr = startElement.getAttributeByName(new QName("id"));
						if(idAttr != null){
							emp.setId(Integer.parseInt(idAttr.getValue()));
						}					
					}// Employee element if end 
					else if(startElement.getName().getLocalPart().equals("age")){
						xmlEvent = xmlEventReader.nextEvent();
						emp.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
					}else if(startElement.getName().getLocalPart().equals("name")){
						xmlEvent = xmlEventReader.nextEvent();
						emp.setName(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("gender")){
						xmlEvent = xmlEventReader.nextEvent();
						emp.setGender(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("role")){
						xmlEvent = xmlEventReader.nextEvent();
						emp.setRole(xmlEvent.asCharacters().getData());
					}
				}//if end
				
				// Employee 객체를 List 객체 배열에 담기
				if(xmlEvent.isEndElement()){
					EndElement endElement = xmlEvent.asEndElement();
					if(endElement.getName().getLocalPart().equals("Employee")){
						empList.add(emp);
					}
				}
			}
		}catch(FileNotFoundException | XMLStreamException e){
			e.printStackTrace();
		}
		
		return empList;
	}

}











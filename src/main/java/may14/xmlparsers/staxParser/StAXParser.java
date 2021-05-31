package may14.xmlparsers.staxParser;


import may14.xmlparsers.Employee;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser {
   private static List<Employee> employeeList = StAXParser.parse("src/may14/xmlparsers/staxParser/employees.xml");
    public static void main(String[] args) {

        employeeList.forEach(System.out::println);
        findEmployee("Anna", "Anna");
    }

    private static void findEmployee(String name, String lastName){
        for(int i = 0; i < employeeList.size(); i++){
            String array[] = employeeList.get(i).getName().split(" ");
            if(array[0].equals(name) && array[1].equals(lastName)){
                System.out.format("Name: %s \nJob position: %s \nDepartment: %s\nWork experience: %s"
                ,employeeList.get(i).getName()
                ,employeeList.get(i).getJob()
                        ,employeeList.get(i).getDepartment()
                        ,employeeList.get(i).getWorkExperience());
            }
        }
    }

    public static List<Employee> parse(String path) {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(path));
            while (reader.hasNext()) {
                XMLEvent nextEvent = reader.nextEvent();
                if (nextEvent.isStartElement()) {
                    StartElement startElement = nextEvent.asStartElement();
                    switch (startElement.getName()
                            .getLocalPart()) {
                        case "employee":
                            employee = new Employee();
                            Attribute id = startElement.getAttributeByName(new QName("id"));
                            if (id != null) {
                                employee.setId(Integer.parseInt(id.getValue()));
                            }
                            break;
                        case "name":
                            nextEvent = reader.nextEvent();
                            employee.setName(nextEvent.asCharacters()
                                    .getData());
                            break;
                        case "job":
                            nextEvent = reader.nextEvent();
                            employee.setJob(nextEvent.asCharacters()
                                    .getData());
                            break;
                        case "department":
                            nextEvent = reader.nextEvent();
                            employee.setDepartment(nextEvent.asCharacters()
                                    .getData());
                            break;
                        case "workExperience":
                            nextEvent = reader.nextEvent();
                            employee.setWorkExperience(Integer.parseInt(nextEvent.asCharacters().getData()));
                            break;
                    }
                }
                if (nextEvent.isEndElement()) {
                    EndElement endElement = nextEvent.asEndElement();
                    if (endElement.getName()
                            .getLocalPart()
                            .equals("employee")) {
                        employees.add(employee);
                    }
                }
            }
        } catch (XMLStreamException xse) {
            System.out.println("XMLStreamException");
            xse.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException");
            fnfe.printStackTrace();
        }
        return employees;
    }
}

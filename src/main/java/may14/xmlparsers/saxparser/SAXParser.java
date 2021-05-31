package may14.xmlparsers.saxparser;

import may14.xmlparsers.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXParser {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();

        parser.parse(new File("src/may14/employees.xml"), handler);

        List<Employee> employeeList = handler.getRes();
        employeeList.forEach(System.out::println);


    }


    private static class XMLHandler extends DefaultHandler {
        private ArrayList<Employee> employees;
        private StringBuilder currentElement = new StringBuilder();
        Employee employee;


        public List<Employee> getRes() {
            return employees;
        }

        @Override
        public void startDocument() throws SAXException {
            employees = new ArrayList<>();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            currentElement.setLength(0);
            if (qName.equals("employee")) {
                employee = new Employee();
                String id = attributes.getValue("id");
                employee.setId(Integer.valueOf(id));

            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equals("name")) {
                employee.setName(currentElement.toString());
            }
            if (qName.equals("job")) {
                employee.setJob(currentElement.toString());
            }
            if (qName.equals("department")) {
                employee.setDepartment(currentElement.toString());
            }
            if (qName.equals("workExpierence")) {
                employee.setWorkExperience(new Integer(currentElement.toString()));
            }
            if (qName.equals("name")) {
                employees.add(employee);
            }
        }

        public void characters(char ch[], int start, int length) {
            currentElement.append(ch, start, length);

        }
    }
}

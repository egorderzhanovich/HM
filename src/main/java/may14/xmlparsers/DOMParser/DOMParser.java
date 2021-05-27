package may14.xmlparsers.DOMParser;

import may14.xmlparsers.Employee;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParser {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/may14/employees.xml");

        NodeList employeesNodes = document.getElementsByTagName("employee");
        for(int i = 0; i < employeesNodes.getLength();i++){
            Node empl = employeesNodes.item(i);

            if(empl.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) empl;

                System.out.println("Employee id: "
                        + element.getAttribute("id"));
                System.out.println("Name: " +
                        element.getElementsByTagName("name")
                                .item(0)
                                .getTextContent());
                System.out.println("Job position: " +
                        element.getElementsByTagName("job")
                                .item(0)
                                .getTextContent());
                System.out.println("Department: " +
                        element.getElementsByTagName("department")
                                .item(0)
                                .getTextContent());
                System.out.println("Work experience: " +
                        element.getElementsByTagName("workExperience")
                                .item(0)
                                .getTextContent() + " years");
                System.out.println("------------------------------");
            }


        }

    }
}

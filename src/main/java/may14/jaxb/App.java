package may14.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        try {
           // marshal();
            System.out.println(unmarshall());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void marshal() throws JAXBException, IOException {
        Book book = new Book();
        book.setId(1L);
        book.setName("Book");
        book.setAuthor("Author");
        book.setDate(new Date());

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, new File("src/may14/jaxb/book.xml"));
    }

    public static Book unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        return (Book) context.createUnmarshaller()
                .unmarshal(new FileReader("src/may14/jaxb/book.xml"));
    }
}

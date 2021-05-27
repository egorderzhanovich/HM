package may14.jaxb;

import javax.xml.bind.annotation.*;
import java.util.Date;
@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name","author", "date" })
public class Book {

        private Long id;
        private String name;
        private String author;
        private Date date;

        @XmlAttribute
        public void setId(Long id) {
            this.id = id;
        }

        @XmlElement(name = "title")
        public void setName(String name) {
            this.name = name;
        }
        @XmlElement(name = "author")
        public void setAuthor(String author) {
            this.author = author;
        }

        public Book() {
        }

        public Book(Long id, String name, String author, Date date) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.date = date;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }
}


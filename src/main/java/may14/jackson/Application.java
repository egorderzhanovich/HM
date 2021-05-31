package may14.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Person personWrite = new Person("Egor", 85, Arrays.asList("Born", "lived", "died"));
        // java object to JSON
        //objectMapper.writeValue(new File("src/main/java/may14/jackson/person.json"), personWrite);

        //JSON to java object
        Person personRead = objectMapper.readValue(new File("src/main/java/may14/jackson/person.json"), Person.class);
        System.out.println(personRead);
    }
}

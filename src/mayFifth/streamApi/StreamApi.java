package mayFifth.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("lasal","kosok","delta","шалаш","123321","то что кабак отч от","alaska","why are you running"));
        list.stream().filter(s-> (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))).forEach(s-> System.out.println(s));
    }
}

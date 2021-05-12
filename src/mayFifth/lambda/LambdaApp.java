package mayFifth.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaApp {
    static ArrayList<String> s2 = new ArrayList<String>();
    static ArrayList<String> s = new ArrayList<String>();
    static ArrayList<String> s3 = new ArrayList<String>();

    static {
        s.add("A");s.add("AA");s.add("AAA");s.add("AAAA");
        s2.add("B"); s2.add("BBB"); s2.add("BB"); s2.add("BBBB"); s2.add("BBBBBB");
        s3.add("C");s3.add("Cc");s3.add("CCC");s3.add("CCCC");s3.add("CCCCC");s3.add("CCCCCC");s3.add("CCCCCCC");
    }

    public static void main(String[] args) {
        sortAsc(new ArrayList<>(Arrays.asList(s,s2,s3)));
        sortDesc(new ArrayList<>(Arrays.asList(s,s2,s3)));
    }


    public static void sortAsc(List<List<String>> lists){
        lists.sort((o1, o2) -> o2.size() - o1.size());
        for (List<String> list : lists) {
            System.out.println(list.toString());
        }
    }
    public static void sortDesc(List<List<String>> lists){
        lists.sort((o1, o2) -> o1.size() - o2.size());
        for (List<String> list : lists) {
            System.out.println(list.toString());
        }
    }
}


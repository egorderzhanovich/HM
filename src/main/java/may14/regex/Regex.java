package may14.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(isIPRegexValid("abc.def.gha.bcd"));
        System.out.println(isDateValid());
        System.out.println(isURLValid("https://regex101.com/"));
    }

    public static boolean isIPRegexValid(String ipaddress) {
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
        Matcher matcher = pattern.matcher(ipaddress);
        return matcher.matches();
    }

    public static boolean isDateValid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert date in YYYY/MM/DD HH:MM:SS format");
        String data = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{4}/\\d{2}/\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }

    public static boolean isURLValid(String url) {
        Pattern pattern = Pattern.compile("^(?:https?:\\/\\/)?(?:[^@\\n]+@)?(?:www\\.)?([^:\\/\\n?]+)/");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}

package ua.lviv.iot.RegEx;

import java.util.LinkedList;
import java.util.List;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMailServisesInText{
    public static void findMailServerInText(final String text) {
        List<String> foundServersNames = new LinkedList<>();
        String patternForString = "(\\@\\w+\\.\\w+)";
        Pattern pattern = Pattern.compile(patternForString);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String stringFounder = matcher.group();
           
            for (int i = stringFounder.length() - 1; i > 0; i--) {
                stringFounder += stringFounder.charAt(i);
            }
            foundServersNames.add(matcher.group());
            System.out.println(foundServersNames);
        }
    }
}


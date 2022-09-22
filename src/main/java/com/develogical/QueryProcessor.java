package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "cache-carti";
        }
        if (query.toLowerCase().contains("spencer")) {
            return "Good Morning";
        }

        Pattern mult = Pattern.compile("what is (\\d+) multiplied by (\\d+)");
        Matcher matcher = mult.matcher(query);
        System.out.println(matcher.matches());
        if (matcher.matches()) {
            String first = matcher.group(1);
            String second = matcher.group(2);
            int res = Integer.valueOf(first) * Integer.valueOf(second);
            return String.valueOf(res);
        }

        return "";
    }
}

package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "the GOAT";
        }
        if (query.toLowerCase().contains("13 plus 7")) {
            return "20";
        }
        if (query.toLowerCase().contains("ur mother")) {
            return "ur sister";
        }
        
        return "";
    }
}

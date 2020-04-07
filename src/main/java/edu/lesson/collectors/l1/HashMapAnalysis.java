package edu.lesson.collectors.l1;

import java.util.HashMap;
import java.util.Map;

public class HashMapAnalysis {
    public static void main(String[] args) {
        Map<String, String> bookMap = new HashMap<String, String>(){
            {
                put("name", "book-name");
                put("author", "book-autho");
                put("page", "book-page");
                put("publish", "book-publish");
            }
        };

        bookMap.entrySet().forEach(
                m -> {
                    System.out.println(m.getKey());
                    System.out.println(m.getValue());

                }
        );
        String name = "name";
        System.out.println(name.hashCode());

    }
}

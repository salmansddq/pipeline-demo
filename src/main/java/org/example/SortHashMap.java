package org.example;

import io.cucumber.java.sl.In;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {

        Map<String, Integer> values = new HashMap<>();

        values.put("A",3);
        values.put("D",6);
        values.put("B",1);
        values.put("C",4);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(values.entrySet());

        
    }
}

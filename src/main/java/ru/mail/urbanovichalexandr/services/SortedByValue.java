package ru.mail.urbanovichalexandr.services;

import java.util.*;


public class SortedByValue {

//сортировка коллекции по убыванию
    public static Map<String, Integer> sortByValue(Map<String, Integer> counterMap){
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(counterMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry: list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

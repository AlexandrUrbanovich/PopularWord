package ru.mail.urbanovichalexandr.services;

import java.util.Map;


public class PrintMap {

//вывод первых 10 значений коллекции
    public static <K, V> void printMap(Map<K, V> map){
        int i = 0;
        for(Map.Entry<K, V> entry : map.entrySet()){
            if(i < 10){
                System.out.println(entry.getKey() + "=" + entry.getValue());
                i++;
            }
        }
    }
}

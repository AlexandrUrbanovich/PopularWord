package ru.mail.urbanovichalexandr.services;


import java.util.*;

import static ru.mail.urbanovichalexandr.services.PrintMap.printMap;
import static ru.mail.urbanovichalexandr.services.SortedByValue.sortByValue;

public class CountWord {

//заносим каждое слово в коллекцию HashMap, а в значении считаем количество повторений слова в тексте
    public static String count(List<String> words){

        Map<String, Integer> counterMap = new HashMap<String, Integer>();
        for(String word: words){
            if(!word.isEmpty()){
                Integer count = counterMap.get(word);
                if(count == null){
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

//вывод отсортированной колекции
        Map<String, Integer> sortedMap = sortByValue(counterMap);
        printMap(sortedMap);

        return null;

    }

}

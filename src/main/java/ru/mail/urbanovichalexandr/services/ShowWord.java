package ru.mail.urbanovichalexandr.services;



import ru.mail.urbanovichalexandr.dao.ReadFile;
import java.util.ArrayList;
import java.util.List;
import static ru.mail.urbanovichalexandr.dao.ReadFile.readUsingBufferedReader;

public class ShowWord {

    String pronouns = "pronouns.txt";
    String fileName = "E:\\exer.txt";

    String contents = readUsingBufferedReader(fileName);
    String contentsPronouns = readUsingBufferedReader(pronouns);

//преобразуем текст и исключаемые слова в коллекцию ArrayList
    List<String> list1 = new ArrayList<String>(new ReadFile(fileName, "\\W+"));
    List<String> list2 = new ArrayList<String>(new ReadFile(pronouns, "\\W+"));

//исключаем все местоимения и предлоги
    String getWord(){
        list1.removeAll(list2);
        return CountWord.count(list1);
    }

}

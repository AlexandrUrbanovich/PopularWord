package ru.mail.urbanovichalexandr;

import ru.mail.urbanovichalexandr.dao.ReadFile;
import ru.mail.urbanovichalexandr.services.CountWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.mail.urbanovichalexandr.dao.ReadFile.readUsingBufferedReader;
import static ru.mail.urbanovichalexandr.services.CountWord.count;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String pronouns = "pronouns.txt";

//запрашиваем у пользователя путь к файлу, читаем его и передаем функции для чтения файла
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter file name.");
    String fileName = scanner.nextLine();
    String contents = readUsingBufferedReader(fileName);
    String contentsPronouns = readUsingBufferedReader(pronouns);


//преобразуем текст и исключаемые слова в коллекцию ArrayList
    List<String> list1 = new ArrayList<String>(new ReadFile(fileName, "\\W+"));
    List<String> list2 = new ArrayList<String>(new ReadFile(pronouns, "\\W+"));

//исключаем все местоимения и предлоги
    list1.removeAll(list2);
    contents = count(list1);

    }
}

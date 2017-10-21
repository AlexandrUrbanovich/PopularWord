package ru.mail.urbanovichalexandr.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class ReadFile extends ArrayList<String> {
    public static String readUsingBufferedReader(String fileName) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            try {
                String line;
                String ls = System.getProperty("line.separator");
                while((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(ls);
                }
            }finally{
                reader.close();
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);

        return stringBuilder.toString();
    }


    public ReadFile(String fileName, String splitter) {
        super(Arrays.asList(readUsingBufferedReader(fileName).split(splitter)));
        if(get(0).equals("")) remove(0);
    }
}

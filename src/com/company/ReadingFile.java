package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile implements Runnable{
    @Override
    public void run() {
        File file = new File("F:\\Uni Rating.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int ascii = fileReader.read();
            String content = "";
            while (ascii!=-1){
                content+=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile implements Runnable{
    @Override
    public void run() {
        File file = new File("F:\\Uni Rating.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("IRAN UNIVERSITY RATING");
            fileWriter.write("\n");
            fileWriter.write("Tehran University --> 1");
            fileWriter.write("\n\t");
            fileWriter.write("Tarbiat Modares University --> 2");
            fileWriter.write("\n\t\t");
            fileWriter.write("Ferdosi Mashhad University --> 3");
            fileWriter.write("\n\t\t\t");
            fileWriter.write("Shiraz University --> 4");
            fileWriter.write("\n\t\t\t\t");
            fileWriter.write("Tabriz University --> 5");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        WritingFile writingFile = new WritingFile();
        Thread writingThread = new Thread(writingFile);
        ReadingFile readingFile = new ReadingFile();
        Thread readingThread = new Thread(readingFile);
        writingThread.setPriority(Thread.MAX_PRIORITY);
        readingThread.setPriority(Thread.MIN_PRIORITY);
        writingThread.start();
        readingThread.start();
    }
}

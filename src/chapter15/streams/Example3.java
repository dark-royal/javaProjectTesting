package chapter15.streams;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\chapter15\\streams\\sample.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation,true)){
            fileOutputStream.write("\nInvest your money wisely, don't play sporty bet".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error :" + e.getMessage());
        }

        //two type of imput stream
        /***
         * byte based stream
         * 1.input side and output side
         * .class input stream
         * object input stream
         * file input stream
         * Data input stream
         *
         * 2.Output stream
         * .file output stream
         * .data output stream
         * object output stream
         * print stream
         *
         *
         *
         * character based stream
         *
         *1. input
         * .Reader
         * .File reader
         * .Input stream reader
         * .buffered reader
         * .string reader
         *
         * 2.Output
         * .File writer
         * .output stream writer
         * .buffered writer
         * string writer
         */
    }
}

package objectOrientedProgramming3;

import javax.swing.*;

public class MainApp {
    private static final Diaries diaries = new Diaries();

    public static void main(String[] args) {
       // mainMenu();
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void print(String output){
        JOptionPane.showMessageDialog(null,"output" );
    }


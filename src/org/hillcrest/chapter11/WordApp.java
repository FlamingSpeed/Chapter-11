package org.hillcrest.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) throws FileNotFoundException {
        var inputFile = new File("files//words.txt");
        var in = new Scanner(inputFile);
        while(in.hasNext()){
            System.out.println(in.next());
        }
    }
}

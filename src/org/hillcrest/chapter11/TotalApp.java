package org.hillcrest.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TotalApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner  console= new Scanner(System.in);
        System.out.print("Input file:");
        String inputFileName = console.nextLine();
        System.out.print("Output file:");
        String outputFileName = console.nextLine();

        File inputFile= new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        double total = 0;
        while(in.hasNextDouble()){
            var value = in.nextDouble();
            out.printf("%10.2f\n", value);
            total += value;
        }
        out.printf("Total: %10.2f", total);
        in.close();
        out.close();
    }
}

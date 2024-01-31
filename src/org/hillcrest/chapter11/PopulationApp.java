package org.hillcrest.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopulationApp {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("files\\countries.txt");
        Scanner in = new Scanner(inputFile);
        while(in.hasNextLine()){
            String line = in.nextLine();
            /*int i = 0;
            while(!(Character.isDigit(line.charAt(i)))){
                i++;
            }
            var countryName = line.substring(0,i);
            var population = line.substring(i);
            */
            Scanner lineIn = new Scanner(line);
            String countryName = "";
            while(!lineIn.hasNextInt()){
                countryName=countryName+" "+ lineIn.next();
            }
            int population = lineIn.nextInt();

            System.out.printf("country: %s population: %d", countryName, population);
        }

    }
}

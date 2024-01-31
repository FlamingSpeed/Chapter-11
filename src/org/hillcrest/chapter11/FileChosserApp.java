package org.hillcrest.chapter11;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileChosserApp {
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if(chooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
        }
    }
}

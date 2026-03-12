/*
5. Write a java program to write a sentence 
    “Java is Object oriented programming” using FileOutputStream class and
    Read this file using FileInputStream class and find total number of vowel in the file.
*/

package Lab2;

import java.io.*;

public class Q05 {
    public static void main(String[] args) throws IOException {
        // Write into file
        String sent = "Java is Object Oriented Programming";
        FileOutputStream fout = new FileOutputStream("program.txt");
        byte[] data = sent.getBytes();
        fout.write(data);
        fout.close();
        System.out.println("File Written Successfully.");

        // Read from file
        FileInputStream fin = new FileInputStream("program.txt");
        int i;
        while ((i = fin.read()) != -1)
            System.out.print((char) i);
        fin.close();
        System.out.println("\nFile Read Successfully.");
    }
}

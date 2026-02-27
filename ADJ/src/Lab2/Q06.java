//6. Write a java program to write and Read file using FileWriter and FileReader class.

package Lab2;

import java.io.*;

public class Q06 {
    public static void main(String[] args) throws Exception {
        // Write
        String cname = "Himalaya College of Engineering.";
        FileWriter fw = new FileWriter("cname.txt");
        fw.write(cname);
        fw.close();
        System.out.println("File Written Successfully.");
        // Read
        FileReader fr = new FileReader("cname.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
        System.out.println("\nFile Read Successfully.");
    }

}

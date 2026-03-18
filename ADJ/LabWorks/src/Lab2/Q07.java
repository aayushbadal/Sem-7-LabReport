/*
7. Write java program to save 3 student record 
    (such as Roll, name, address, and phone Number) into file student.txt and 
    display the student record whose address is Kritipur.
*/

package Lab2;

import java.io.*;

public class Q07 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("student.txt");
        fw.write("1 Ram Kritipur 9841\n");
        fw.write("2 Shyam Kathmandu 9842\n");
        fw.write("3 Hari Kritipur 9843\n");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("Kritipur")) {
                System.out.println(line);
            }
        }
        br.close();
    }
}

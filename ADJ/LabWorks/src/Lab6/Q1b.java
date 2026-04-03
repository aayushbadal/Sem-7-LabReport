// b. URL Connection Class
package Lab6;
import java.net.*;
import java.io.*;
public class Q1b {
    public static void main(String[] args) throws Exception {
        String url = "https://www.google.com";
        URL ur = new URL(url);
        URLConnection con = ur.openConnection();
        InputStream ips = con.getInputStream();
        int i;
        while ((i = ips.read()) != -1) {
            System.out.print((char) i);
        }
        ips.close();

    }
}

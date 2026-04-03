
package Lab6;

import java.net.*;
import java.io.*;
public class Q2Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Client..............");
        Socket cs = new Socket("localhost", 95);
        System.out.println("Connected with Server...........");

        BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
        while (true) {
            String fs = br.readLine();
            System.out.println("From Server:" + fs);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("To Server:");
            String ts = in.readLine();
            out.println(ts);

            if (fs.equalsIgnoreCase("bye") || fs == null)
                break;

        }
        br.close();
        out.close();
        cs.close();
    }
}

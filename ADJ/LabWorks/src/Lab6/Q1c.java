// c. InetAddress Class
package Lab6;

import java.net.InetAddress;
public class Q1c {
    public static void main(String[] args) {
        try {

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Information:");
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());
            
            System.out.println("----------------------------------");


            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google Information:");
            System.out.println("Host Name: " + google.getHostName());
            System.out.println("IP Address: " + google.getHostAddress());

            System.out.println("----------------------------------");


            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("All IP Addresses of www.google.com:");
            for (InetAddress addr : allAddresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

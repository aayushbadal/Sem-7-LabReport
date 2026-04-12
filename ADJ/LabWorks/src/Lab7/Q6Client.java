package Lab7;
import java.rmi.registry.*;
public class Q6Client {
    public static void main(String[] args) throws Exception{
        
        Registry reg = LocateRegistry.getRegistry(1099);
        Q6Inf rmi = (Q6Inf)reg.lookup("server");
        System.out.println("Connected With Server ...");
        int m = rmi.mul(7,9);
        int d = rmi.div(992,4);
        System.out.println("Multiplication of Two Numbers = "+m+"\nDivisionof Two Numbers = "+d);
     }
}

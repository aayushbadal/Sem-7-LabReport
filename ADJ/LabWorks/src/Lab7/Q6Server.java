package Lab7;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class Q6Server extends UnicastRemoteObject implements Q6Inf {
    public Q6Server() throws RemoteException{
        super();
    }
    public int mul(int x, int y) throws RemoteException{
        return x*y;
    }
    public int div(int x, int y) throws RemoteException{
        return x/y;
    }
    public static void main(String[] args) throws Exception{
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("server", new Q6Server());
        System.out.println("Server is Started ...");
    }
}

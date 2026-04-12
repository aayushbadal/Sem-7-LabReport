package Lab7;
import java.rmi.*;
public interface Q6Inf extends Remote{
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
}

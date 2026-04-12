/*
6. Write a RMI program to find Multiplication and division of two numbers.
Methods Multiplication and division should be invoked from some remote machine.
*/

package Lab7;
import java.rmi.*;
public interface Q6Inf extends Remote{
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
}

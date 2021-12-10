import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    public String reverse(String s) throws RemoteException;
    public String min(String s) throws RemoteException;
    public String caseChanger(String s) throws RemoteException;
    
}

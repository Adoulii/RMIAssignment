import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();
        java.rmi.registry.LocateRegistry.createRegistry(1250);
        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();

    }

    public String min(String s) {
        char min = 'z';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= min)
                min = s.charAt(i);
        }
        String res = String.valueOf(min);
        return res;
    }

    public String caseChanger(String s) {
        StringBuilder chres = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char res = (char) (s.charAt(i) + 32);
                chres.append(res);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                char res = (char) (s.charAt(i) - 32);
                chres.append(res);
            } else {
                chres.append(s.charAt(i));
            }
        }
        return chres.toString();
    }
}

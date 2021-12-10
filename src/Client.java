import java.rmi.Naming;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner input = new Scanner(System.in);
            System.out.println("Donner une chaine de caractére: ");
            String s = input.nextLine();
            System.out.println(service.reverse(s));
            System.out.println("Donner une chaine de caractére: ");
            s= input.nextLine();
            System.out.println(service.caseChanger(s));
            System.out.println("Donner une chaine de caractére: ");
            s= input.nextLine();
            System.out.println(service.min(s));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

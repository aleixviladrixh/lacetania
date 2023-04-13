import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IniciBasicRefact {
public static void main(String[] args) throws IOException {
InputStreamReader entrada = new InputStreamReader(System.in);
BufferedReader teclat = new BufferedReader(entrada);
    String u = "8";
    int i = 0;

System.out.println("Comença el test!!!\nPer superar els test has de contestar la pregunta correctament.\n2+6=? ");
String a = teclat.readLine();
    {
    if (a==u){
        i = 10;
        System.out.println( "\nPunts totals: " + i +"\nFelicitats, resposta correcta!!!");
    }
    else
        System.out.println("\nPunts totals: " + i + "\nHo sento no has superat el test!!!");
        }
    }
}

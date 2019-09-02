
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int cases = 0;
        String input;
        while (!(input = read.readLine()).equals("#")) {
            cases++;
            System.out.print("Case "+cases+": ");
            switch (input) {
                case "HELLO": System.out.println("ENGLISH"); break;
                case "HOLA": System.out.println("SPANISH"); break;
                case "HALLO": System.out.println("GERMAN"); break;
                case "BONJOUR": System.out.println("FRENCH"); break;
                case "CIAO": System.out.println("ITALIAN"); break;
                case "ZDRAVSTVUJTE": System.out.println("RUSSIAN"); break;
                default: System.out.println("UNKNOWN"); break;
            }
        }
    }
}

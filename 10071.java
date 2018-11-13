import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            String text[] = leer.readLine().split(" ");
            Integer v = Integer.parseInt(text[0]);
            Integer t = Integer.parseInt(text[1]);
            System.out.println((v*2*t));
        }
    }
}

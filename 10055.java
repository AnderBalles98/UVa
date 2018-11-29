import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String line[];
        while (leer.ready()) {
            line = leer.readLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            System.out.println(Long.max(a, b)-Long.min(a, b));
        }

    }
}

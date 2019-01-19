import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            String line[] = leer.readLine().split(" ");
            float x = Float.parseFloat(line[0]);
            float y = Float.parseFloat(line[1]);
            float z = Float.parseFloat(line[2]);
            Float out = z/(x+y);
            out = out*((2*x)-y);
            System.out.println(out.intValue());
        }
    }
    
}

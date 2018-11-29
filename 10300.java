
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
        int cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            int farmers = Integer.parseInt(leer.readLine());
            int total = 0;
            for (int j = 0; j < farmers; j++) {
                String line[] = leer.readLine().split(" ");
                total+=(Integer.parseInt(line[0])*Integer.parseInt(line[2]));
            }
            System.out.println(total);
        }
    }
}

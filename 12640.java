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
            String line[] = leer.readLine().split(" ");
            int max = 0, acum = 0, num;
            for (int i = 0; i < line.length; i++) {
                num = Integer.parseInt(line[i]);
                acum+=num;
                max = Integer.max(max, acum);
                if (acum<0) {
                    acum = 0;
                }
            }
            System.out.println(max);
        }
    }
}

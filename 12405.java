import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
    
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            int cases = Integer.parseInt(leer.readLine());
            for (int i = 1; i <= cases; i++) {
                int o = Integer.parseInt(leer.readLine());
                String line = leer.readLine();
                int out=0;
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j)=='.') {
                        out++;
                        j+=2;
                    }
                }
                System.out.println("Case "+i+": "+out);
            }
    }
}

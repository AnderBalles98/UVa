
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            char[] line = (leer.readLine()+".").toCharArray();
            int out = 0;
            for (int i = 0; i < line.length-1; i++) {
                if (Character.isLetter(line[i]) && !Character.isLetter(line[i+1])) {
                    out++;
                }
            }
            System.out.println(out);
        }
    }
}

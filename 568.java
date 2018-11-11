import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Locale;


/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            Integer num = Integer.parseInt(leer.readLine());
            BigInteger sol = new BigInteger("1");
            for (int i = 1; i <= num; i++) {
                sol = sol.multiply(BigInteger.valueOf(i));
            }
            String text = sol + "";
            for (int i = text.length() - 1; i >= 0; i--) {
                if (text.charAt(i) != '0') {
                    System.out.format(Locale.ROOT, "%5d -> %c\n", num, text.charAt(i));
                    break;
                }
            }
        }

    }
}

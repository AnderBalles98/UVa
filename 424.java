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
        String text;
        BigInteger num = new BigInteger("0");
        while (!(text=leer.readLine()).equals("0")) {
            num = num.add(new BigInteger(text));
        }
        System.out.println(num);
    }
}

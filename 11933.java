
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @author ANDERSON BALLESTEROS
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = read.readLine()).equals("0")) {
            input = Integer.toBinaryString(Integer.parseInt(input));
            String a = "";
            String b = "";
            boolean forA = true;
            for (int i = input.length() - 1; i >= 0; i--) {
                if (input.charAt(i) == '1') {
                    if (forA == true) {
                        a = input.charAt(i)+a;
                        b = 0 + b;
                        forA = false;
                    } else {
                        a = 0 + a;
                        b = input.charAt(i) + b;
                        forA = true;
                    }
                } else {
                    a = 0+a;
                    b = 0+b;
                }
            }
            System.out.println(Integer.parseInt(a, 2)+" "+Integer.parseInt(b, 2));
        }
    }
}

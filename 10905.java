import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            int num = 0;
            while ((num = Integer.parseInt(leer.readLine())) != 0) {
                ArrayList<String> list = new ArrayList();
                String g[] = leer.readLine().split(" ");
                list.addAll(Arrays.asList(g));

                Collections.sort(list, (String o1, String o2) -> {
                    BigInteger a = new BigInteger(o1+o2);
                    BigInteger b = new BigInteger(o2+o1);
                    return b.compareTo(a);
                });
                for (String element : list) {
                   System.out.print(element); 
                }
                System.out.println();
            }
        }

    }
}

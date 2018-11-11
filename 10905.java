package UVa;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static int reint(char c) {
        return Integer.parseInt(c + "");
    }

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        while (leer.hasNext()) {
            int num = 0;
            while ((num = Integer.parseInt(leer.nextLine())) != 0) {
                ArrayList<String> list = new ArrayList();
                String g[] = leer.nextLine().split(" ");
                list.addAll(Arrays.asList(g));

                Collections.sort(list, (String o1, String o2) -> {
                    BigInteger a = new BigInteger(o1+o2);
                    BigInteger b = new BigInteger(o2+o1);
                    return b.compareTo(a);
                });
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    System.out.print(it.next());
                }
                System.out.println();
            }
        }

    }
}

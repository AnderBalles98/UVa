import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            while (!(line = leer.readLine()).equals("0 0")) {
                String text[] = line.split(" ");
                Integer M = Integer.valueOf(text[1]);
                Integer N = Integer.valueOf(text[0]);
                ArrayList<Integer> list = new ArrayList<>(N);
                for (int i = 0; i < N; i++) {
                    list.add(Integer.valueOf(leer.readLine()));
                }
                Collections.sort(list, (Integer o1, Integer o2) -> {
                    Integer modo1 = o1 % M;
                    Integer modo2 = o2 % M;
                    if (modo1.compareTo(modo2) == 0) {
                        if ((Math.abs(o1 % 2) == 1 && o2 % 2 == 0)) {
                            return -1;
                        } else if ((o1 % 2 == 0 && Math.abs(o2 % 2) == 1)) {
                            return 1;
                        } else if (Math.abs(o1 % 2) == 1 && Math.abs(o2 % 2) == 1) {
                            return o2.compareTo(o1);
                        } else if (o1 % 2 == 0 && o2 % 2 == 0) {
                            return o1.compareTo(o2);
                        }
                    }
                    return modo1.compareTo(modo2);
                });
                Iterator it = list.iterator();
                System.out.println(N + " " + M);
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            }
            System.out.println("0 0");
        }
    }
}

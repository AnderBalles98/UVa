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
        while (leer.ready()) {
            Integer casos = Integer.parseInt(leer.readLine());
            for (int i = 0; i < casos; i++) {
                Integer num;
                Integer cantidad = 0;
                Double min = 0.0;
                PriorityQueue<Integer> cola = new PriorityQueue<>((Integer o1, Integer o2) -> {
                    return o2.compareTo(o1); //To change body of generated lambdas, choose Tools | Templates.
                });
                while ((num = Integer.parseInt(leer.readLine())) != 0) {
                    cola.add(num);
                    cantidad++;
                }
                for (int j = 1; j <= cantidad; j++) {
                    min += 2 * Math.pow(cola.remove().doubleValue(), j);
                }
                if (min < 5000000.0) {
                    System.out.println(min.intValue());
                } else {
                    System.out.println("Too expensive");
                }
            }
        }
    }

}

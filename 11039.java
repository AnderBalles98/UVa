package UVa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static Integer solution(PriorityQueue<Integer> color1, PriorityQueue<Integer> color2) {
        Integer sum = 0;
        Integer p = null;
        p = color1.poll();
        sum++;
        Boolean change = false;
        while (!color1.isEmpty() || !color2.isEmpty()) {
            while (!color2.isEmpty()) {
                if (color2.peek() > p) {
                    color2.poll();
                    change = false;
                } else {
                    p = color2.poll();
                    sum++;
                    change = true;
                    break;
                }
            }
            if (!change || color1.isEmpty()) {
                return sum;
            }
            while (!color1.isEmpty()) {
                if (color1.peek() > p) {
                    color1.poll();
                    change = false;
                } else {
                    p = color1.poll();
                    sum++;
                    change = true;
                    break;
                }
            }
            if (!change || color2.isEmpty()) {
                return sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            Integer casos = Integer.parseInt(leer.readLine());
            for (int i = 0; i < casos; i++) {
                PriorityQueue<Integer> color1 = new PriorityQueue<>((Integer o1, Integer o2) -> {
                    return o2.compareTo(o1);
                });
                PriorityQueue<Integer> color2 = new PriorityQueue<>((Integer o1, Integer o2) -> {
                    return o2.compareTo(o1);
                });
                Integer pisos = Integer.parseInt(leer.readLine());
                for (int j = 0; j < pisos; j++) {
                    Integer tamano = Integer.parseInt(leer.readLine());
                    if (tamano < 0) {
                        color2.add(Math.abs(tamano));
                    } else {
                        color1.add(tamano);
                    }
                }

                if (!color1.isEmpty() && !color2.isEmpty()) {
                    if (color1.peek() > color2.peek()) {
                        System.out.println(solution(color1, color2));
                    } else {
                        System.out.println(solution(color2, color1));
                    }
                } else {
                    if (pisos > 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }
}

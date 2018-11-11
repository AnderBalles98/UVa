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
            Integer casos = Integer.valueOf(leer.readLine());
            for (int i = 1; i <= casos; i++) {
                String text[] = leer.readLine().split(" ");
                Integer term1=Integer.valueOf(text[0]);
                Integer term2=Integer.valueOf(text[1]);
                Integer Final=Integer.valueOf(text[2]);
                Integer attendance=Integer.valueOf(text[3]);
                Integer test1=Integer.valueOf(text[4]);
                Integer test2=Integer.valueOf(text[5]);
                Integer test3=Integer.valueOf(text[6]);
                PriorityQueue<Integer> test = new PriorityQueue<>((Integer o1, Integer o2) -> {
                    return o2.compareTo(o1); //To change body of generated lambdas, choose Tools | Templates.
                });
                test.add(test1);
                test.add(test2);
                test.add(test3);
                Integer pruebas = (test.poll()+test.poll())/2;
                Integer porcentaje = term1+term2+Final+attendance+pruebas;
                System.out.print("Case "+i+": ");
                if (porcentaje>=90) {
                    System.out.println("A");
                }else if (porcentaje>=80) {
                    System.out.println("B");
                }else if (porcentaje>=70) {
                    System.out.println("C");
                }else if (porcentaje>=60) {
                    System.out.println("D");
                }else{
                    System.out.println("F");
                }
            }
        }
    }
}

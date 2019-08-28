import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * @author Anderson Ballesteros
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = read.readLine()).equals("0 0 0")) {
            String in[] = input.split(" ");
            int maxLenght = Integer.parseInt(in[1]);
            int pay = Integer.parseInt(in[2]);
            PriorityQueue<Integer> morning = new PriorityQueue<>((Integer o1, Integer o2) -> {
                return o2.compareTo(o1); //To change body of generated lambdas, choose Tools | Templates.
            });
            PriorityQueue<Integer> night = new PriorityQueue<>();
            String morningString[] = read.readLine().split(" ");
            String nightString[] = read.readLine().split(" ");
            for (int i = 0; i < morningString.length; i++) {
                morning.add(Integer.parseInt(morningString[i]));
                night.add(Integer.parseInt(nightString[i]));
            }
            int extraLenghts=0;
            while (!morning.isEmpty()) {
                int lenght = morning.remove()+night.remove();
                if (lenght>maxLenght) {
                    extraLenghts+=(lenght-maxLenght);
                }
            }
            System.out.println(extraLenghts*pay);
            
        }
    }
}

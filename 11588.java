import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static Integer count(String text, Character c) {
        Integer total = 0;
        for (Character g : text.toCharArray()) {
            if (g.equals(c)) {
                total++;
            }
        }
        return total;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer casos = Integer.valueOf(leer.readLine());
        for (int i = 1; i <= casos; i++) {
            String text[] = leer.readLine().split(" ");
            Integer rows = Integer.valueOf(text[0]);
            Integer M = Integer.valueOf(text[2]);
            Integer N = Integer.valueOf(text[3]);
            Set<Character> set = new LinkedHashSet<>();
            String totalText = "";
            for (int j = 0; j < rows; j++) {
                String subText = leer.readLine();
                totalText += subText;
                for (char c : subText.toCharArray()) {
                    set.add(c);

                }

            }
            PriorityQueue<Integer> list = new PriorityQueue<>(set.size(), (Integer o1, Integer o2) -> {
                return o2.compareTo(o1); //To change body of generated lambdas, choose Tools | Templates.
            });
            Iterator it = set.iterator();
            while (it.hasNext()) {
                list.add(count(totalText, (Character) it.next()));
            }
            Integer max = list.peek();
            Integer total=0;
            while (!list.isEmpty()) {
                Integer num = list.remove();
                if (max.equals(num)) {
                    total += (num*M);
                }else{
                    total += (num*N);
                }
            }
            System.out.println("Case "+i+": "+total);
        }

    }
}

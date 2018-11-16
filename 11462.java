import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer numbers;
        while (!(numbers = Integer.parseInt(leer.readLine())).equals(0)) {
            ArrayList<String> list = new ArrayList<>(numbers);
            String line[] = leer.readLine().split(" ");
            list.addAll(Arrays.asList(line));
            Collections.sort(list, (String o1, String o2) -> {
                if (o1.length() ==1 && o2.length()==1) {
                    return o1.compareTo(o2);
                }
                Integer a = Integer.parseInt(o1);
                Integer b = Integer.parseInt(o2);
                return a.compareTo(b);
            });
            for (int i = 0; i < list.size(); i++) {
                if (i==list.size()-1) {
                    System.out.println(list.get(i));
                    break;
                }
                System.out.print(list.get(i)+" ");
                
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anderson Ballesteros
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(read.readLine());
        for (int i = 0; i < cases; i++) {
            String input[] = read.readLine().split(" ");
            int bottles = Integer.parseInt(input[0])+Integer.parseInt(input[1]);
            int price = Integer.parseInt(input[2]);
            int drunks=0;
            while (bottles>=price) {
                drunks+=bottles/price;
                bottles=(bottles/price)+(bottles%price);
            }
            System.out.println(drunks);
        }
    }
}

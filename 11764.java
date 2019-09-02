import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(read.readLine());

        for (int i = 1; i <= cases; i++) {
            read.readLine();
            System.out.print("Case " + i + ": ");
            String[] input = read.readLine().split(" ");
            int actually, highJumps = 0, lowJumps = 0, before = Integer.parseInt(input[0]);
            for (int j = 1; j < input.length; j++) {
                actually = Integer.parseInt(input[j]);
                if (actually>before) {
                    highJumps++;
                }else if (actually<before) {
                    lowJumps++;
                }
                before=actually;
            }
            System.out.println(highJumps+" "+lowJumps);
        }
    }
}

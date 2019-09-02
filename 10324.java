
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int cases = 0;
        while (read.ready()) {
            cases++;
            String binary = read.readLine();
            int test = Integer.parseInt(read.readLine());
            System.out.println("Case "+cases+":");
            for (int i = 0; i < test; i++) {
                String input[] = read.readLine().split(" ");
                int min = Integer.parseInt(input[0]);
                int max = Integer.parseInt(input[1]);
                int minaux = Integer.min(min, max);
                max = Integer.max(min, max);
                min = minaux;
                String subBinary = binary.substring(min, max+1);
                if (min == max) {
                    System.out.println("Yes");
                }else if (subBinary.contains("0") && subBinary.contains("1")) {
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }
        
    }
}

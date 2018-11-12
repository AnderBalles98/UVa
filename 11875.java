import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 1; i <= cases; i++) {
            String text[]=leer.readLine().split(" ");
            Integer playeres = text.length-1;
            playeres/=2;
            playeres++;
            System.out.println("Case "+i+": "+text[playeres]);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 1; i <= cases; i++) {
            String text[] = leer.readLine().split(" ");
            Double C = Double.parseDouble(text[0]);
            Double aum = Double.parseDouble(text[1]);
            Double F = ((((double)9/5)*C)+32.0);
            F+=aum;
            F-=32.0;
            C = F*((double)5/9);
            System.out.format(Locale.ROOT, "%s %.2f\n", "Case "+i+":", C);
        }
    }
}

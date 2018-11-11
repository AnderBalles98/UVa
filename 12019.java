import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            Integer casos = Integer.valueOf(leer.readLine());
            for (int i = 0; i < casos; i++) {
                String text[] = leer.readLine().split(" ");
                Calendar cal = Calendar.getInstance();
                cal.set(2011, Integer.parseInt(text[0])-1, Integer.parseInt(text[1]));
                System.out.format(Locale.ROOT, "%tA\n", cal);
            }

    }
}

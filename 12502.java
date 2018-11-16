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
        int cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            String line[] = leer.readLine().split(" ");
            double x = Double.parseDouble(line[0]);
            double y = Double.parseDouble(line[1]);
            double z = Double.parseDouble(line[2]);
            Double out = z/(x+y);
            out = out*((2*x)-y);
            if (out<0) {
                out=0.0;
            }
            if (out.doubleValue()>z) {
                out=z;
            }
            String auxOut = ""+out;
            int index = auxOut.indexOf(".");
            auxOut = auxOut.substring(index+1);
            
            if (auxOut.indexOf("999999")==0) {
                out++;
            }
            System.out.println(out.intValue());
        }
    }
    
}

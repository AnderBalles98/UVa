
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
        while (leer.ready()) {
            double a = Double.parseDouble(leer.readLine());
            double area3 = (Math.pow(a, 2.0)/2.0)*(1.0-(Math.PI/6.0)-(Math.sqrt(3.0)/4.0));
            area3*=2;
            double area2 = (a*a)-((Math.PI*Math.pow(a, 2.0))/4.0)-(2.0*area3);
            double area1 = (a*a)-(4.0*area2)-(4.0*area3);
            System.out.format(Locale.ROOT, "%.3f %.3f %.3f\n", area1, 4*area2, 4*area3);
            
        }
    }
}

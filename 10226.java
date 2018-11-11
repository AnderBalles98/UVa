import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer casos = Integer.parseInt(leer.readLine());
        for (int i = 0; i < casos; i++) {
            TreeMap<String, Integer> hash = new TreeMap<>();
            Integer cantidad = 0;
            if (i==0) {
                leer.readLine();
            }
            
            String text;
            while ((text = leer.readLine()) != null && !text.isEmpty()) {
                if (hash.get(text) == null) {
                    hash.put(text, 1);
                } else {
                    hash.put(text, hash.get(text) + 1);
                }
                cantidad++;
            }
            for (Map.Entry element : hash.entrySet()) {
                Double porc = (Double.parseDouble(element.getValue() + "")) / (cantidad.doubleValue()) * 100;
                
                System.out.format(Locale.ROOT, "%s %.4f\n", element.getKey(),porc);
            }
            if (i!=casos-1) {
                System.out.println();
            }
            
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer casos = Integer.valueOf(leer.readLine());
        for (int i = 0; i < casos; i++) {
            String aux = leer.readLine().replace("{", "").replace("}", "");
            String text[];
            TreeMap<String, String> dic = new TreeMap<>();
            TreeMap<String, String> dic2 = new TreeMap<>();
            if (!aux.isEmpty()) {
                text = aux.split(",");
                for (String element : text) {
                    String h[] = element.split(":");
                    dic.put(h[0], h[1]);
                }
            }
            aux = leer.readLine().replace("{", "").replace("}", "");
            String text2[];
            if (!aux.isEmpty()) {
                text2 = aux.split(",");
                for (String element : text2) {
                    String h[] = element.split(":");
                    dic2.put(h[0], h[1]);
                }
            }

            String add = "+";
            String change = "*";
            for (Map.Entry<String, String> element : dic2.entrySet()) {
                if (dic.get(element.getKey()) == null) {
                    add += element.getKey() + ",";
                } else {
                    String t = dic.get(element.getKey());
                    if (!t.equals(element.getValue())) {
                        change += element.getKey() + ",";
                    }
                }

            }
            if (!add.equals("+")) {
                System.out.println(add.substring(0, add.length() - 1));
            }
            String remove = "-";
            for (Map.Entry<String, String> element : dic.entrySet()) {
                if (dic2.get(element.getKey()) == null) {
                    remove += element.getKey() + ",";
                }
            }
            if (!remove.equals("-")) {
                System.out.println(remove.substring(0, remove.length() - 1));
            }
            if (!change.equals("*")) {
                System.out.println(change.substring(0, change.length() - 1));
            }
            if (add.equals("+") && remove.equals("-") && change.equals("*")) {
                System.out.println("No changes");
            }
            System.out.println();
        }
    }
}

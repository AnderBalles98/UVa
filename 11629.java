import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static String solution(String operator, int condition, double acum) {
        String correct = "correct.";
        if (operator.equals("<") && acum < condition) {
            return correct;
        } else if (operator.equals("<=") && acum <= condition) {
            return correct;
        } else if (operator.equals(">") && acum > condition) {
            return correct;
        } else if (operator.equals(">=") && acum >= condition) {
            return correct;
        } else if (operator.equals("=") && acum == condition) {
            return correct;
        }
        return "incorrect.";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String text[] = leer.readLine().split(" ");
        Integer p = Integer.parseInt(text[0]);
        Integer g = Integer.parseInt(text[1]);
        LinkedHashMap<String, Double> dic = new LinkedHashMap<>();
        for (int i = 0; i < p; i++) {
            String word[] = leer.readLine().split(" ");
            dic.put(word[0], Double.parseDouble(word[1]));
        }
        for (int i = 1; i <= g; i++) {
            String copm[] = leer.readLine().split(" ");
            Integer condition = Integer.parseInt(copm[copm.length - 1]);
            Double acum = 0.0;
            
            for (int j = 0; j < copm.length - 1; j++) {
                
                if (!(copm[j].equals("+")) && !(copm[j].equals("<")) && !(copm[j].equals("<="))
                        && !(copm[j].equals(">")) && !(copm[j].equals(">=")) && !(copm[j].equals("="))) {
                    
                    acum += dic.get(copm[j]);
                }
                
            }
            String operator = copm[copm.length - 2];
            
            System.out.println("Guess #"+i+" was "+solution(operator, condition.intValue(),
                    Double.parseDouble(String.format(Locale.ROOT, "%.2f", acum))));

        }
    }
}

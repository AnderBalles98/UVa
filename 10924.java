import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static Boolean isPrimeAux(Integer num) {
        
        for (int i = 2; i < num; i++) {
            
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Boolean isPrime(Integer num) {
        
        if (num == 1 || num == 2 || num == 5) {
            return true;
        }
        
        String j = num + "";
        Character finalNum = j.charAt(j.length() - 1);
        
        if (finalNum.equals('0') || finalNum.equals('2') || finalNum.equals('4')
                || finalNum.equals('5') || finalNum.equals('6') || finalNum.equals('8')) {
            return false;
        }
        return isPrimeAux(num);
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> dic = new HashMap<>();
        Integer value = 0;
        
        for (int i = 97; i <= 122; i++) {
            dic.put((char) i, ++value);
        }
        
        for (int i = 65; i <= 90; i++) {
            dic.put((char) i, ++value);
        }
        
        while (leer.ready()) {

            String text = leer.readLine();
            Integer num = 0;
            for (char c : text.toCharArray()) {
                num += dic.get(c);
            }
            if (isPrime(num)) {
                System.out.println("It is a prime word.");
            } else {
                System.out.println("It is not a prime word.");
            }
        }
    }
}

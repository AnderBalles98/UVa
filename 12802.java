import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    private static boolean isPalindromic(int num){
        
        String aux = ""+num;
        int index = aux.length();
        if (aux.length()==1) {
            return true;
        }
        if (index%2 == 1) {
            index/=2;
            index++;
            String aux2="";
            for (int i = index; i < aux.length(); i++) {
                aux2 = aux.charAt(i)+aux2;
            }
            if (aux.substring(0, index-1).equals(aux2)) {
                return true;
            }
            return false;
        }else{
            index/=2;
            String aux2="";
            for (int i = index; i < aux.length(); i++) {
                aux2 = aux.charAt(i)+aux2;
            }
            if (aux.substring(0, index).equals(aux2)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isPrime(int num){
        if (num<=2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while (!isPalindromic(num = Integer.parseInt(leer.readLine())) || !isPrime(num)) {
            System.out.println(2*num);
        }
        System.out.println(2*num);
    }
}

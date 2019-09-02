import java.io.IOException;
import java.util.Scanner;

/**
 * @author ANDERSON BALLESTEROSS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int cases = 0, n, balance;
        
        while ((n = read.nextInt())!=0) {
            balance = 0;
            cases++;
            for (int i = 0; i < n; i++) {
                if (read.nextInt()==0) {
                    balance--;
                }else{
                    balance++;
                }
            }
            System.out.println("Case "+cases+": "+balance);
        }

    }

}

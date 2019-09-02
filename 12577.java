import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROSS
 */

class Main {

    public static void main(String[] args) throws IOException {
     
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        int cases = 0;
        while (!(input = read.readLine()).equals("*")) {
            cases++;
            System.out.print("Case "+cases+": Hajj-e-");
            if (input.equals("Hajj")) {
                System.out.println("Akbar");
            }else{
                System.out.println("Asghar");
            }
        }
        
        
        
    }

}

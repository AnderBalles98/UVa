import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROSS
 */

class Main {

    public static void main(String[] args) throws IOException {
     
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int lines = Integer.parseInt(read.readLine()), balance = 0;
        
        for (int i = 0; i < lines; i++) {
            String input = read.readLine();
            if (input.equals("report")) {
                System.out.println(balance);
            }else{
                balance+=Integer.parseInt(input.split(" ")[1]);
            }
        }
        
    }

}

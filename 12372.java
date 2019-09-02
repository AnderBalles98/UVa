import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROSS
 */

class Main {

    public static void main(String[] args) throws IOException {
     
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(read.readLine());
        int n = 0;
        for (int i = 0; i < cases; i++) {
            n ++;
            String input[] = read.readLine().split(" ");
            System.out.print("Case "+n+": ");
            if (Integer.parseInt(input[0])<=20 && Integer.parseInt(input[1])<=20 
                    && Integer.parseInt(input[2])<=20) {
                System.out.println("good");
            }else{
                System.out.println("bad");
            }
        }
        
    }

}

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
        for (int i = 0; i < cases; i++) {
            String input=read.readLine();
            if (input.length()==3) {
                if (input.charAt(0)=='t' && input.charAt(2)=='o' || input.endsWith("wo")
                        || input.startsWith("tw")) {
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }else{
                System.out.println(3);
            }
        }
        
    }

}

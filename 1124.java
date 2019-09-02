import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROSS
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while (read.ready()) {
            System.out.println(read.readLine());
        }
    }

}

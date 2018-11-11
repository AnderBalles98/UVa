import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
 class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String text[] = leer.readLine().split(" ");
           Integer N = Integer.valueOf(text[0]);
           Integer a = Integer.valueOf(text[1]);
           Integer b = Integer.valueOf(text[2]);
           Integer j=2;
           Integer res=1;
           Integer cantTeams = (int)Math.pow(2, N);
            for (int i = 1; i <= cantTeams; i+=j) {
                if (a>=i && a<i+j) {
                    if (b>=i && b<i+j) {
                        break;
                    }
                    
                    j*=2;
                    i=1-j;
                    res++;
                }else if (i==cantTeams-j+1) {
                    j*=2;
                    i=1-j;
                    res++;
                }
            }
            System.out.println(res);
        }
    }
    
}

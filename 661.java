import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author ANDERSON BALLESTEROS
 */

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String in;
        int sequeces = 0;
        while (!(in=read.readLine()).equals("0 0 0")) {
            sequeces++;
            String input[] = in.split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            int fases[] = new int[n];
            int state[] = new int[n];
            int maxConsumo = 0, consumoActual = 0;
            for (int i = 0; i < n; i++) {
                fases[i] = Integer.parseInt(read.readLine());
                state[i] = 0; 
            }
            System.out.println("Sequence "+sequeces);
            for (int i = 0; i < m; i++) {
                int index = Integer.parseInt(read.readLine())-1;
                if (state[index]==0) {
                    state[index] = 1;
                    consumoActual+=fases[index];
                }else{
                    state[index] = 0;
                    consumoActual-=fases[index];
                }
                maxConsumo = Integer.max(maxConsumo, consumoActual);
                
            }
            if (maxConsumo<=c) {
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was "+maxConsumo+" amperes.");
            }else{
                System.out.println("Fuse was blown.");
            }
            System.out.println();
        }
        
    }
}

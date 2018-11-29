
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int rows;
        while ((rows = Integer.parseInt(leer.readLine()))!=0) {
            int min = 25;
            String row;
            int spacesList[] = new int[rows];
            for (int i = 0; i < rows; i++) {
                int spaces = 0;
                row = leer.readLine();
                for (char c : row.toCharArray()) {
                    if (c!='X') {
                        spaces++;
                    }
                }
                if (min>spaces) {
                    min = spaces;
                }
                spacesList[i]=spaces;
            }
            int out = 0;
            for (int i = 0; i < spacesList.length; i++) {
                out+=(Math.abs(min-spacesList[i]));
            }
            System.out.println(out);
        }
    }
}

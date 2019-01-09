
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String line;
        char[][] mat;
        int cases = 0;
        while (!(line = read.readLine()).equals("0 0")) {
            if (line.isEmpty()) {
                continue;
            }
            if (cases != 0) {
                System.out.println();
            }
            System.out.println("Field #" + (++cases) + ":");
            
            
            String number[] = line.split(" ");
            int rows = Integer.parseInt(number[0]);
            int columns = Integer.parseInt(number[1]);
            mat = new char[rows][columns];
            for (int i = 0; i < rows; i++) {
                char[] row = read.readLine().toCharArray();
                for (int j = 0; j < row.length; j++) {
                    mat[i][j] = row[j];
                }
            }
            int output;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    output = 0;
                    if (mat[i][j] == '*') {
                        System.out.print("*");
                    } else {
                        try {
                            if (mat[i][j-1]== '*') {
                                output++;
                            }
                        } catch (Exception e){}
                        try {
                            if (mat[i-1][j-1]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i-1][j]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i-1][j+1]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i][j+1]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i+1][j+1]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i+1][j]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        try {
                            if (mat[i+1][j-1]== '*') {
                                output++;
                            }
                        } catch (Exception e) {}
                        
                        System.out.print(output);
                    }
                }
                System.out.println();
            }
        }
    }
}

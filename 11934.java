import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        while (!(aux=leer.readLine()).equals("0 0 0 0 0")) {
            String text[] = aux.split(" ");
            Integer a = Integer.parseInt(text[0]);
            Integer b = Integer.parseInt(text[1]);
            Integer c = Integer.parseInt(text[2]);
            Integer d = Integer.parseInt(text[3]);
            Integer l = Integer.parseInt(text[4]);
            Integer out=0;
            for (int i = 0; i <= l; i++) {
                Integer r =(int) ((a.doubleValue()*Math.pow(i, 2))+(b*i) + c);
                if (r%d==0) {
                    out++;
                }
            }
            System.out.println(out);
        }
    }
}

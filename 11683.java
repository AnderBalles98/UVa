import java.io.IOException;
import java.util.Scanner;

/**
 * @author ANDERSON BALLESTEROSS
 */

class Main {

    public static void main(String[] args) throws IOException {
     
        Scanner read = new Scanner(System.in);
        
        int height, lenght;
        while ((height=read.nextInt())!=0) {
            lenght=read.nextInt();
            int beforeHeight = read.nextInt();
            int cuts = height - beforeHeight;
            for (int i = 1; i < lenght; i++) {
                int actuallyHeight = read.nextInt();
                if (actuallyHeight<beforeHeight) {
                    cuts+=beforeHeight-actuallyHeight;
                }
                beforeHeight=actuallyHeight;
            }
            System.out.println(cuts);
        }
        
        
    }

}

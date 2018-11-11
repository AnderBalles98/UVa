import java.util.Scanner;
import java.math.BigInteger;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) {
        //System.out.println("");
        BigInteger aa=new BigInteger("6227020800"); 
        BigInteger ab=new BigInteger("10000");
        Scanner leer = new Scanner(System.in);
        while (leer.hasNext()) {
                int a = leer.nextInt();
                BigInteger respuesta = new BigInteger("1");
                if (a<0) {                    
                for (int i = 0; i > a; i--) {
                    respuesta = respuesta.multiply(BigInteger.valueOf(i - 1));
                }
                }if (a>0) {
                for (int i = 0; i < a; i++) {
                    respuesta = respuesta.multiply(BigInteger.valueOf(i + 1));
                }    
                }
                if (respuesta.compareTo(aa)>0) {
                    System.out.println("Overflow!"+" "+a);
                }if (respuesta.compareTo(ab)<0) {
                    System.out.println("Underflow! "+a);
                }if (respuesta.compareTo(aa)<0&&respuesta.compareTo(ab)>0) {
                 System.out.println(respuesta+" "+a);   
                }
                }
            }

        
    }


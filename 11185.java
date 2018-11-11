import java.util.Scanner;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Integer o;
        while ((o = leer.nextInt())>=0) {
            String a = "";
            while (o != 0) {
                a = o % 3 + a;
                o /= 3;
            }
            if (a.isEmpty()) {
                System.out.println("0");
            }else{
                System.out.println(a);
            }
            
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        while (read.ready()) {
            String in = read.readLine();
            String input[] = in.split("!");
            for (String element : input) {
                int times = 0;
                for (Character charElement : element.toCharArray()) {
                    try {
                        times += Integer.parseInt(charElement + "");
                    } catch (Exception e) {
                        for (int i = 0; i < times; i++) {
                            if (charElement.equals('b')) {
                                System.out.print(" ");
                            } else {
                                System.out.print(charElement);
                            }
                        }
                        times=0;
                    }

                }
                System.out.println("");
            }
            if (in.isEmpty() && in == null) {
                System.out.println("");
            }
        }

    }
}


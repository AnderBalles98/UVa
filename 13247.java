import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String read;
        while (!(read = leer.readLine()).equals("0")) {
            String text[] = read.split(" ");
            String output="";
            ArrayList<Integer> posList = new ArrayList<>(10000);
            Integer pos = 1;
            for (String element: text) {
                element = element.replaceAll(" ", "");
                
                if (element.isEmpty()) {
                    continue;
                }
                
                if (!element.equals("#")) {
                    posList.add(pos);
                    if (!element.equals("-")) {
                        Integer intElement = Integer.parseInt(element);
                        Integer begin = posList.size();
                        Integer end = begin-intElement;
                        output+=(posList.get(posList.size()-1) - posList.get(end-1))+" ";
                    }else{
                        output+=element+" ";
                    }
                }else{
                    output+=element+" ";
                }
                pos++;
            }
            System.out.println(output.substring(0, output.length()-1));
        }
    }
}

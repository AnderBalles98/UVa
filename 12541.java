import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static class Birth implements Comparable<Birth>{
        public Integer year;
        public Integer month;
        public Integer day;
        public String name;

        public Birth(Integer year, Integer month, Integer day, String name) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.name = name;
        }

        @Override
        public int compareTo(Birth o) {
            if (year.equals(o.year)) {
                if (month.equals(o.month)) {
                    return day.compareTo(o.day);
                }
                return month.compareTo(o.month);
            }
            return year.compareTo(o.year);
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer casos = Integer.valueOf(leer.readLine());
        ArrayList<Birth> list = new ArrayList<>();
        for (int i = 0; i < casos; i++) {
            String text[] = leer.readLine().split(" ");
            list.add(new Birth(Integer.valueOf(text[3]), Integer.valueOf(text[2]),
                    Integer.valueOf(text[1]), text[0]));
        }
        Collections.sort(list);
        
        System.out.println(list.get(list.size()-1).name);
        System.out.println(list.get(0).name);
    }
}

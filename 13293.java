import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    static class Player implements Comparable<Player>{
        public String name;
        public Integer points;

        public Player(String name, Integer points) {
            this.name = name;
            this.points = points;
        }

        @Override
        public int compareTo(Player o) {
            if (points.equals(o.points)) {
                return name.compareToIgnoreCase(o.name);
            }
            return o.points.compareTo(points);
        }

        @Override
        public String toString() {
            return name + " " + points;
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader leer =  new BufferedReader(new InputStreamReader(System.in));
        String text;
        Integer cases=0;
        while ((text = leer.readLine())!=null && !text.isEmpty()) {
            Integer players = Integer.parseInt(text);
            System.out.println("Case "+(++cases)+":");
            ArrayList<Player> playersList = new ArrayList<>(players);
            for (int i = 0; i < players; i++) {
                String details[] = leer.readLine().split(";");
                Integer points = 0;
                for (int j = 1; j < details.length; j++) {
                    String pointsList[] = details[j].split(" ");
                    for (int k = 0; k < pointsList.length; k++) {
                        Integer point = Integer.parseInt(pointsList[k]);
                        if (point.equals(1)) {
                            if (k==pointsList.length-1) {
                                points++;
                            }
                            points++;
                        }
                    }
                }
                playersList.add(new Player(details[0], points));
            }
            Collections.sort(playersList);
            for (int i = 0; i < playersList.size(); i++) {
                System.out.println(playersList.get(i));
            }
        }
    }
}

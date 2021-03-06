import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static class participante implements Comparable<participante> {

        public int number;
        public int[] problems = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        public int problem = 0;
        public int[] Incorrectos = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        public int time = 0;

        public participante(int number) {
            this.number = number;
        }

        public String toString() {
            return number + " " + problem + " " + time;
        }

        public int compareTo(participante o) {
            if (problem > o.problem) {
                return -1;
            } else if (problem == o.problem) {
                if (time < o.time) {
                    return -1;
                } else if (time == o.time) {
                    return ((Comparable) number).compareTo((Comparable) o.number);
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }

    }

    private static int index(ArrayList<participante> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).number == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            int casos = Integer.parseInt(leer.readLine());
            leer.readLine();
            ArrayList<String> solutions = new ArrayList<>();
            for (int i = 0; i < casos; i++) {
                String text;
                ArrayList<participante> list = new ArrayList(100);
                while ((text = leer.readLine()) != null && !text.isEmpty()) {
                    String text2[] = text.split(" ");
                    int number = Integer.parseInt(text2[0]);
                    int problem = Integer.parseInt(text2[1]);
                    int time = Integer.parseInt(text2[2]);
                    String word = text2[3];
                    participante part;
                    int index = index(list, number);
                    if (index == -1) {
                        part = new participante(number);
                        list.add(part);
                        index = list.size() - 1;
                    }
                    part = list.get(index);
                    if (word.equalsIgnoreCase("I")) {
                        part.Incorrectos[problem - 1]++;
                    } else if (word.equalsIgnoreCase("C")) {
                        if (0 == part.problems[problem - 1]) {
                            part.problems[problem - 1] = 1;
                            part.problem++;
                            part.time += (time + (part.Incorrectos[problem - 1] * 20));
                        }

                    }
                }
                Collections.sort(list);
                String solution = "";
                for (int j = 0; j < list.size(); j++) {
                    solution += list.get(j);
                    if (j != list.size() - 1) {
                        solution += "\n";
                    }
                }
                if (i != casos - 1) {
                    solution += "\n";
                }
                solutions.add(solution);
            }
            for (int i = 0; i < solutions.size(); i++) {
                System.out.println(solutions.get(i));
            }
        }

    }
}

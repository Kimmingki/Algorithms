import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void solution() {
        final int ROWS = 20;
        
        Map<String, Double> gradePoint = Map.of(
            "A+", 4.5, "A0", 4.0,
            "B+", 3.5, "B0", 3.0,
            "C+", 2.5, "C0", 2.0,
            "D+", 1.5, "D0", 1.0,
            "F",  0.0
        );

        double weightedSum = 0.0;
        double creditSum = 0.0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i=0; i<ROWS; i++) {
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                st.nextToken();
                double credit = Double.parseDouble(st.nextToken());
                String grade = st.nextToken();

                if (!grade.equals("P")) {
                    weightedSum += credit * gradePoint.get(grade);
                    creditSum += credit;
                }
            }
        } catch(IOException e) {
            System.out.println(e);
        }

        double avg = weightedSum / creditSum;
        System.out.printf("%.6f%n", avg);
    }

    public static void main(String[] args) {
        solution();
    }
}

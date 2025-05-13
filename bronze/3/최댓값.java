import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxNum = Integer.MIN_VALUE;
        int maxRow = 1, maxCol = 1;
        

        for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (maxNum < num) {
                    maxNum = num;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxNum).append("\n").append(maxRow).append(' ').append(maxCol);

        System.out.print(sb);
        br.close();
    }

    public static void main(String[] args) {
        try {
            solution();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
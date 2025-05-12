import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] C = new int[N][M];

        // A 행렬
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // B 행렬
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // C행렬 계산
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                sb.append(C[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
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
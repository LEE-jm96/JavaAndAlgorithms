package week_6;

import java.io.*;
import java.util.StringTokenizer;

public class bj1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int result = 1;
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19
        while (true){
            if((result%15 == e%15) && result%28 == s%28 && result%19 == m%19){
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}

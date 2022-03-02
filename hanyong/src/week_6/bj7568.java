package week_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int[][] student = new int[num][2];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            student[i][0] = Integer.parseInt(st.nextToken());
            student[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num; j++) {
                if(student[i][0] < student[j][0] && student[i][1] < student[j][1]){
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}

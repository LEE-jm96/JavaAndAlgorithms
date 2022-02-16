package weeks_4;

import java.io.*;
import java.util.Arrays;

//백준 10989번 : 정렬, 수 정렬하기3
/** Arrays.sort() : DualPivotQuickSort(퀵 정렬)
 * 퀵 정렬과 BufferedReader, BufferedWriter 를 이용 하여 간당 간당 하게 풀 수 도 있다.
 * */
public class Baekjoon_10989_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        bw.write(sb.toString() + '\n');
        bw.flush();
        bw.close();
    }
}

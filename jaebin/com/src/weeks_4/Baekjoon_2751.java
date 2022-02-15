package weeks_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//백준 2751번 : 수 정렬하기2
public class Baekjoon_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        /** 어떤 정렬을 쓸까?*/
        //Arrays.sort() : DualPivotQuicksort
        //Quicksort 평균 O(nlog(n))의 시간복잡도를 가지며 최악의 경우 O(n^2)
        //Collections.sort() : Timsort
        // Timsort의 시간복잡도는 평균 O(n log(n)) 이며 최악의 경우도 O(n log(n)) 이다.

        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
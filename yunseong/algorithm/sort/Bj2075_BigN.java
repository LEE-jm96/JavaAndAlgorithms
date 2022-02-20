package algorithm.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Bj2075_BigN {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n*n];
        int idx = 0;
        for(int i  = 0 ; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0 ; j < n ; j++) {
                arr[idx++] = Integer.parseInt(s[j]);
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[n*n-n]);
    }
}

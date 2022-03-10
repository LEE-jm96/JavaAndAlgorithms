package algorithm.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj18310_antenna {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i< n ; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[(n-1)/2]);
    }
}
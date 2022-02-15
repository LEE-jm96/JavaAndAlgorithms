package algorithm.sort;

import java.util.Scanner;

public class Bj2751_sort2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        boolean[] arr = new boolean[2000001];

        for (int i = 0 ; i<n ; i++) {
            int num = s.nextInt();
            arr[num+1000000] = true;
        }
        for(int i = 0; i < arr.length ; i++) {
           if(arr[i]){
               sb.append((i-1000000)+"\n");
           }
        }
        System.out.println(sb);
    }
}

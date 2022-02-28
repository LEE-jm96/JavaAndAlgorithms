package week_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj2309 {
    static int total = 9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[total];
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }
        Arrays.sort(height);
        loop :
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                if(sum - height[i] - height[j] == 100){
                    print(height,height[i],height[j]);
                    break loop;
                }
            }
        }
    }
    static void print(int[] arr, int a, int b){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != a && arr[i] != b){
                System.out.println(arr[i]);
            }
        }
    }
}

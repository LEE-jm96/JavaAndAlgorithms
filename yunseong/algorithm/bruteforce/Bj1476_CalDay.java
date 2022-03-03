package algorithm.bruteforce;

import java.util.Scanner;

public class Bj1476_CalDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=1; arr[1]=1; arr[2]=1;
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int answer = 1;
        while(true) {
            if(arr[0] == e && arr[1] == s && arr[2] ==m ){
                System.out.println(answer);
                break;
            }
            arr[0]++; arr[1]++; arr[2]++;
            if(arr[0]-16==0) arr[0] = 1;
            if(arr[1]-29==0) arr[1] = 1;
            if(arr[2]-20==0) arr[2] = 1;
            answer++;
        }
    }
}

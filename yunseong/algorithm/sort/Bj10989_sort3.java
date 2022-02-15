package algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10989_sort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());







//      카운트 정렬... 실패!
//
//        boolean[] arr = new boolean[10001];
//        int[] cnt = new int[10001];
//
//
//        for(int i = 0 ; i < cnt.length ; i++) {
//            cnt[i] = 1;
//        }
//
//        for(int i = 0 ; i < n ; i++ ){
//            int num = Integer.parseInt(br.readLine());
//            if(arr[num]){
//                cnt[num]++;
//            }
//            arr[num] = true;
//        }
//        for(int i = 0 ; i < arr.length ; i++) {
//            if(arr[i]){
//                for(int j = 0; j < cnt[i] ; j++){
//                    System.out.println(i);
//                }
//            }
//        }
    }
}

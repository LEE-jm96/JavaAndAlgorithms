package algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10989_sort3 {





// 힙정렬 시간초과..
//    //배열요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
//    static void swap(int[] a, int idx1, int idx2) {
//        int t = a[idx1];
//        a[idx1] = a[idx2];
//        a[idx2] = t;
//    }
//    //a[left] ~ a[right] 를 힙으로 만듭니다.
//    static void downHeap(int[] a, int left, int right) {
//        int temp = a[left];//루트
//        int child;//큰 값을 가진 노드
//        int parent;//부모
//
//        for(parent = left;parent<(right+1) /2 ; parent=child){
//            int cl = parent* 2 +1; //왼쪽자식
//            int cr = cl+1;//오른쪽 자식
//            child = (cr<=right && a[cr] >a[cl])? cr:cl;//큰 값을 가진 노드를 자식에 대입
//            if(temp>= a[child])
//                break;
//            a[parent] = a[child];
//        }
//        a[parent] = temp;
//    }
//
//    //힙정렬
//    static void heapSort(int[] a, int n) {
//        for(int i = (n-1)/2;i>=0; i--) {
//            downHeap(a, i ,n-1);
//        }
//        for(int i = n -1; i>0 ;i--) {
//            swap(a,0,i);
//            downHeap(a,0,i-1);
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i ++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        heapSort(arr, n);
//
//        for(int i = 0; i< n ; i++) {
//            System.out.println(arr[i]);
//        }
//
//

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for(int i = 0 ; i < n ; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int i = 0 ; i < cnt.length ; i++) {
            while(cnt[i]>0){ //i = 1 // val = 2
                System.out.println(i);
                cnt[i]--;
            }
        }
    }
}

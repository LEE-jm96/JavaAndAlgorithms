package algorithm.bruteforce;

import java.util.Scanner;

public class Bj1182_Subsequence {
        static int N, S, count=0;
        static int[] arr;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N= sc.nextInt();
            S= sc.nextInt();
            arr = new int[N];
            for (int i = 0; i <N ; i++) {
                arr[i] =  sc.nextInt();
            }

            dfs(0,0);

            if(S==0){
                count--;
                System.out.println(count);
            }else {
                System.out.println(count);
            }


        }

        private static void dfs(int v , int su){
            if(v==N){
                if(su == S){
                    count++;
                }
                return;
            }

            dfs(v+1, su+arr[v]);
            dfs(v+1, su);
        }

}

package algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj13164_happy {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        //입력값 받기
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //원생 초기화
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while(st.hasMoreTokens()) {
            arr[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }
        int[] answer = new int[n];
        answer[0]=0;
        for(int i = 1 ; i < n ; i++) {
            answer[i] = arr[i]- arr[i-1];
        }
        Arrays.sort(answer);
        int sum = 0;
        for(int i = 0 ; i < n-k+1 ; i++) {
            sum += answer[i];
        }
        System.out.println(sum);

        //예를들어.. n = 5개임
        //-> 1개로 묶을 시 n, 0 1 2 2 4
        //-> 2개로 묶을 시 n - 1, 0 1 2 2
        //-> 3개로 묶을 시 n - 2, 0 1 2
        //-> 4개로 묶을 시 n - 3, 0 1
        //-> 5개로 묶을 시 n - 4, 0

    }

}

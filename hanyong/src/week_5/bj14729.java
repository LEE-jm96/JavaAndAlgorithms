package week_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
학생의 숫자가 많아서 array.sort 불가능
카운팅정렬 이용해서 문제해결.

출력시 "%.3f"를 이용하여 소숫점이하 3자리까지만 출력.

Scanner를 이용해서 입력받을 경우 시간초과 발생.
 */
public class bj14729 {
    static int max = 100001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int student = Integer.parseInt(br.readLine());
        int[] arr = new int[max];
        for (int i = 0; i < student; i++) {
            double score = (Double.parseDouble(br.readLine()));
            arr[(int)(score * 1000)]++ ;
        }
        loop :
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                String result = String.format("%.3f", i/1000.0);
                for (int j = 0; j < arr[i]; j++) {
                    System.out.println(result);
                    count++;
                    if(count==7){
                        break loop;
                    }
                }
            }
        }

    }
}

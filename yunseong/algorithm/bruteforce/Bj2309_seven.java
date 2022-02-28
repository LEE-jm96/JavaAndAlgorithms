package algorithm.bruteforce;

import java.util.*;

public class Bj2309_seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int one = 0, two = 0;
        main : for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j <arr.length ; j++) {
                if(i!=j && sum-(arr[i]+arr[j]) == 100) {//i와 j가 같지 않으면서 총합에서 i+j를 뺐을때 100인경우
                    one= i;
                    two= j;
                    break main;
                }
            }
        }

        for (int i = 0 ; i < arr.length; i++) {
            if(i != one && i != two)
                System.out.println(arr[i]);
        }

        
        //9명
        //7명치 더해서
        //100나오면
        //출력
        //0123456 78
        //012345678

    }
}
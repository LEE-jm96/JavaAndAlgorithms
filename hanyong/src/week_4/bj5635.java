package week_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String arr[][] = new String[num][4];
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.next();
            }
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    } else
                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }
        });

        System.out.println(arr[num-1][0] + "\n" + arr[0][0]);

        sc.close();
    }
}

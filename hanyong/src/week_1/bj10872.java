package week_1;

import java.util.Scanner;

public class bj10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum;
        num = sc.nextInt();
        sc.close();
        sum = fac(num);
        System.out.println(sum);
    }

    public static int fac(int num) {
        if(num <= 1) return 1;
        return num * fac(num - 1);
    }

}
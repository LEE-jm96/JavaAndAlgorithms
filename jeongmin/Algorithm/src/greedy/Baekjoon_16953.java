import java.util.Scanner;

public class Baekjoon_16953{
    public static void Baekjoon_16953(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        int q = sc.nextInt();
        int answer = 0;
        while(true) {
            if(q == su) {
                System.out.println(answer + 1);
                break;
            }
            if(q == 0) {
                System.out.println(-1);
                break;
            }
            if (q % 10 == 1) {
                q /= 10;
                answer++;
            } else {
                if (q % 2 != 0) {
                    System.out.println(-1);
                    break;
                } else {
                    q /= 2;
                    answer++;
                }
            }
        }
    }
}

package sub;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1158 {
    //Josephus 문제
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num+1; i++) {
            queue.offer(i);
        }
        int k = sc.nextInt();
        System.out.print("<");
        while (queue.size()>1){
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll() + ", ");
        }
        System.out.println(queue.poll() + ">");
    }
}

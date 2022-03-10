package algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj7856_Size {

    static class Size {
        int weight;
        int height;
        int rank = 1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Size> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            Size size = new Size();
            size.weight = sc.nextInt();
            size.height = sc.nextInt();
            list.add(size);
        }
        for(int i = 0 ; i < list.size() ; i ++) {
            for(int j = 0; j < list.size() ; j ++) {
                if((list.get(i).weight < list.get(j).weight) && (list.get(i).height < list.get(j).height)){
                    list.get(i).rank++;
                }
            }
        }
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.print(list.get(i).rank + " ");
        }
    }
}

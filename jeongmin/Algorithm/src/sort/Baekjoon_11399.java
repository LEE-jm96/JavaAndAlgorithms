package sort;

import java.util.*;

public class Baekjoon_11399 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int minhap = 0;
      int num = sc.nextInt();
      int[] atm = new int[num];
      
      for(int i = 0; i < atm.length; i++) {
         atm[i] = sc.nextInt();
      }

      Arrays.sort(atm);
      for(int i = 0; i < atm.length; i++) {
         for(int j = 0; j <= i; j++) {
            minhap += atm[j];
         }
      }
      
      System.out.println(minhap);
   }
}
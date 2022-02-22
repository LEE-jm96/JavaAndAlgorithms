package algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj7795_Eat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t ; i++) {//반복
            String[] s = br.readLine().split(" ");
            int[] a = new int[Integer.parseInt(s[0])];
            int[] b = new int[Integer.parseInt(s[1])];
            String[] as = br.readLine().split(" ");
            String[] bs = br.readLine().split(" ");
            for (int j = 0; j < a.length ; j++){
                a[j] = Integer.parseInt(as[j]);
            }
            for (int k = 0 ; k < b.length ; k++) {
                b[k] = Integer.parseInt(bs[k]);
            }
            int cnt = 0;
            Arrays.sort(a);
            Arrays.sort(b);

            for(int x = 0 ; x < a.length ; x++) {
                for(int y = 0 ; y <b.length ; y++) {
                    if(a[x] > b[y]){
                        cnt++;
                    }else break;
                }
            }
            System.out.println(cnt);
        }
    }
}

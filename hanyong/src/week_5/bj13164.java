package week_5;
import java.util.*;
import java.io.*;

public class bj13164 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> list = new ArrayList<>();
        List<Integer> dif = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < n - 1; i++){
            dif.add(list.get(i+1) - list.get(i));
        }

        Collections.sort(dif);

        int result = 0;
        for(int i = 0; i < n-k; i++){
            result += dif.get(i);
        }
        System.out.print(result);
    }
}


package week_5;
//리버트
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj7795 {
    public static int sort(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0;
        for(int i=0;i<a.length;i++) {
            for(int j=b.length-1;j>=0;j--) {
                if(a[i]>b[j]) {
                    ans+=j+1;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arr_a = new int[a];
            int[] arr_b = new int[b];
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < a; j++) {
                arr_a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < b; j++) {
                arr_b[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(sort(arr_a,arr_b)).append("\n");
        }
        System.out.println(sb);
    }
}

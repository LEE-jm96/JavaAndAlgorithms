package greedy;

import java.io.*;
import java.util.*;

public class Baekjoon_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		for(int i = 0; i < coin.length; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		while(K > 0){
			int temp = coin[N-1];
			ans += K / temp;
			K = K % temp;
			N--;
		}
		System.out.println(ans);
	}
}

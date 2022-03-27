package dp;

import java.util.Scanner;

public class Baekjoon_9461{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] pado = new long[101];
		
		pado[1] = 1;
		pado[2] = 1;
		pado[3] = 1;
		pado[4] = 2;
		pado[5] = 2;
		
		for(int i = 6; i < pado.length; i++) {
			pado[i] = pado[i - 1] + pado[i - 5];
		}
		
		for(int j = 1; j <= t; j++) {
			System.out.println(pado[sc.nextInt()]);
		}
	}
}
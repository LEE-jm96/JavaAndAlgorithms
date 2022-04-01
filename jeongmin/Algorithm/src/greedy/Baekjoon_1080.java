import java.util.Scanner;
public class Baekjoon_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[N][M];
		int[][] b = new int[N][M];
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				a[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
			}
		}
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0; j < M; j++) {
				b[i][j] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i <= N-3; i++) {
			for(int j = 0; j <= M-3; j++) {
				if(a[i][j]==b[i][j]) {
					continue;
				}
				cnt++;
				for(int k = i; k < i+3; k++) {
					for(int l = j; l < j+3; l++) {
						a[k][l] = a[k][l] == 0 ? 1 : 0;
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(a[i][j] != b[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon3085 {
	static Character[][] arr;
	static int N;
	static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		arr = new Character[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				
				check();
				temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				char temp = arr[j][i];
				arr[j][i] = arr[j+1][i];
				arr[j+1][i] = temp;
				
			}
			
		}
		System.out.println(count);
	}
	public static void check() {
		for (int i = 0; i < N; i++) {
			int cnt =1;
			for (int j = 0; j < N-1; j++) {
				if(arr[i][j] == arr[i][j+1])
					cnt++;
				else
					cnt =1;
				
				count = Math.max(count, cnt);
			}
		}
		
		for (int i = 0; i < N; i++) {
			int cnt =1;
			for (int j = 0; j < N-1; j++) {
				if(arr[j][i] == arr[j+1][i])
					cnt++;
				else
					cnt =1;
				
				count = Math.max(count, cnt);
				
			}
			
		}
		
	}
}

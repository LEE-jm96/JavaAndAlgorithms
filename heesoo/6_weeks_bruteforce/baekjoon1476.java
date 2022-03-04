import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num=0;
		int e=1;
		int s=1;
		int m=1;
		while(true) {
			if(num%15==e%15&&num%28==s%28&&num%19==m%19) {
				break;
			}
			if(e<arr[0])
				e++;
			if(s<arr[1])
				s++;
			if(m<arr[2])
				m++;
			num++;
		}
		System.out.println(num);
	}
}

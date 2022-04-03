package greedy;

import java.io.*;

public class Baekjoon_12904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S  = br.readLine();
		String T = br.readLine();
		
		while(true) {
			char lastChar = T.charAt(T.length() - 1);
			if(lastChar == 'A') {
				T = T.substring(0, T.length() - 1);
			} else {
				T = T.substring(0, T.length() - 1);
				StringBuffer sb = new StringBuffer(T);
				T = sb.reverse().toString();
			}
			if(S.equals(T)) {
				System.out.println(1);
				break;
			}
			if(T.length() == 0) {
				System.out.println(0);
				break;
			}
		}
	}
}

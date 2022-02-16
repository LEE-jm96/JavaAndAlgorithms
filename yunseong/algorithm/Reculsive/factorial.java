package algorithm.Reculsive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = factorial(n);
		System.out.println(result);	
	}
	
	public static int factorial(int n) {
		if(n==1) return n*1;
		if(n==0) return 1;
		return n*factorial(n-1);
	}

}

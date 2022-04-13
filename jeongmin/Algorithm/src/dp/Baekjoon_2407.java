package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon_2407 {
	public static void main(String[] args) throws IOException, ArithmeticException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	      
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    BigInteger bunmo1 = new BigInteger("1");
	    BigInteger bunmo2 = new BigInteger("1");
	    BigInteger bunja = new BigInteger("1");
	    BigInteger answer = new BigInteger("0");
	    
	    for(int i = 1; i <= n; i++) {
	    	bunja = bunja.multiply(new BigInteger(i+"")); 
	    }
	    
	    for(int i = 1; i <= n - m; i++) {
	    	bunmo1 = bunmo1.multiply(new BigInteger(i+"")); 
	    }
	    
	    for(int i = 1; i <= m; i++) {
	    	bunmo2 = bunmo2.multiply(new BigInteger(i+"")); 
	    }
	    
	    answer = bunja.divide((bunmo1.multiply(bunmo2))) ;
	    System.out.println(answer);
	    
	}
}

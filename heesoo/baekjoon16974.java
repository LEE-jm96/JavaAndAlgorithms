import java.util.Scanner;


public class baekjoon16974 {
	static long[] total, patty;
	static int n;
	static long x;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();//����
		x = scan.nextLong();//��������

		//System.out.println(n+" "+x);
		total = new long[n+1];
		patty = new long[n+1];
		
		total[0]=1;
		patty[0]=1;
		
		for(int i=1;i<=n;i++) {
			total[i]=total[i-1]*2+3;
			patty[i]=patty[i-1]*2+1;
			
		}
		
		
		long cnt = burger(n,x);
		
		System.out.println(cnt);
		
	}
	public static long burger(int n, long x) {
		
		if(n==0) {
			if(x==0)
				return 0;
			else if(x==1)
				return 1;
		}
		
		if(x==1) {
			return 0;
		}else if(x == total[n-1]+2) {
			return patty[n-1]+1;
		}else if(x <= total[n-1]+2) {
			return burger(n-1,x-1);
		}else if(x >= total[n-1]+2 && x < total[n]) {
			return burger(n-1,x-(total[n-1]+2))+patty[n-1]+1;
		}else {
			return patty[n];
		}
	}
}

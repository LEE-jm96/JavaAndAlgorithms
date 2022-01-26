import java.util.Scanner;

public class Mutiple {
	static int count =0;
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
	
			long result = multiple3(scan.nextLong());
			scan.close();
			
			System.out.println(count);
			if(result%3==0) {
				System.out.print("YES");
			}else {
				System.out.print("NO");
			}
      
        
	}
	public static long multiple3(long n) {
      
		String str = Long.toString(n);
		long cnt = str.length()-1;
		if(str.length()>1) {
			long sum =0;
			
			for(long i=cnt;i>=0 ;i--) {
				sum += (long)((n%Math.pow(10, i+1))/(Math.pow(10, i)));
			}
				count++;
				return multiple3(sum);
			
		}
		else {
			return n;
		}
	}
}

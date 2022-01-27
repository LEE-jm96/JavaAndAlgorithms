import java.util.Scanner;

public class Multiple {
	static int count =0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String str = scan.next();
			
		int result = multiple3(str);
			
		System.out.println(count);
		if(result%3==0) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
      
        
	}
	public static int multiple3(String num) {
      
		int cnt = num.length();

		if(num.length()>1) {
			int sum =0;
			
			for(int i=0;i<=cnt-1 ;i++) {
				sum+=num.charAt(i)-'0';
			}
			count++;
			return multiple3(Integer.toString(sum));			
		}
		else {
			return Integer.parseInt(num);
		}
	}
}

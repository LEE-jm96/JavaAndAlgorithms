import java.util.Scanner;

public class baekjoon10994{
	static int[] x;
	static String[][] arr;
	static int count =0;
	static int a= 0;
	
	public static void main(String[] args) {
		// 큰 틀 부터, 시작점 잡고 재귀
		
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		x = new int[num];
		x[0]=1;
		
		for(int i=1;i<num;i++) {
			x[i]=x[i-1]+4;	
		}
		
		arr = new String[x[num-1]][x[num-1]];
		
		solve(num);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]!="*") {
					arr[i][j]=" ";
				}
				arr[arr.length/2][arr.length/2]="*";
			}
		}
		  for(int i=0;i<arr.length;i++) { 
			  for(int j=0;j<arr[i].length;j++) {
				  System.out.print(arr[i][j]); }
			  System.out.println(); }	
		
	}
	public static void solve(int n) {
		int b= x[n-1];
		
		if(n==1) {
			return ;
		} else {
			if(n==x.length) {
				int i=0;
				while(i<b) {
					arr[a][i]="*";
					arr[b-1][i]="*";
					
					arr[i][a]="*";
					arr[i][b-1]="*";
					i++;
				}
			}else {
				a+=2;
				
				int i=0;
				while(i<x[n-1]) {
					arr[a][a+i]="*";
					arr[b-1+count*2][a+i]="*";
					
					arr[a+i][a]="*";
					arr[a+i][b-1+count*2]="*";
					i++;
	
				}
			}
		count++;	
		}
		solve(n-1);
	
	}
}

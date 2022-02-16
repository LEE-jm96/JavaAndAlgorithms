package algorithm.Reculsive;

import java.util.Scanner;

public class MultipleOf3 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String num = sc.next();
			int cnt = 0;
			int[] cntAndsum = CountSum(num, cnt);
			String YesOrNo = (cntAndsum[1]%3==0&&cntAndsum[1]!=0)? "YES": "NO";//각 자릿수 합이 0이 아니거나 3의배수이면 YES 아니면 NO 
			
			System.out.println(cntAndsum[0]);//몇번더했는지 출력
			System.out.println(YesOrNo);//YES NO 출력
		}
		
		public static int[] CountSum(String num, int cnt) {
			int sum = 0;
			
			if(num.length()>1) {//10의 자릿수 이상 입력값들어왔을때
				for(int i = 0 ; i < num.length() ; i ++) { //각자릿수 더해주고
					sum += Integer.parseInt(num.charAt(i)+"");
				}
				num = sum+"";//더할 숫자 num에 반영
				cnt++;//횟수추가
				return CountSum(num, cnt);
			}else {//1의 자릿수가 들어왔을 때 혹은 계속 더해서 1의자릿수가 들어온경우  
				sum = Integer.parseInt(num); //sum에 더할 숫자 num만 넣어주고 반복문 종료 
				return new int[] {cnt, sum};//횟수와 합 반환
			}	
		}

}

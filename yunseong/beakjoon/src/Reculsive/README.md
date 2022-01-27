# 재귀함수

## 개념
> 💡자기자신을 호출하여 작업을 수행하는 함수.</br>

- 종료조건을 설정해줘야 무한루프를 방지할 수 있다.</br>
- 팩토리얼, 미로찾기, 하노이탑, 최대공약수 등에 활용. </br>

## 문제

### 백준 10872 팩토리얼
[팩토리얼](https://www.acmicpc.net/problem/10872)</br>
- N!구하는 문제. 주의할 것은 N의 범위가 0부터인 점. 0!은 1인 조건을 넣어주어야 한다.</br>
- 시간복잡도</br>
O(N) : 재귀호출을 N번 수행하면 끝나기 때문입니다.</br>

---

## 문제 

### 백준 1769 3의배수

![](https://images.velog.io/images/oh_yunseong/post/be84e2ee-ed59-4b0e-be83-42790589118f/%E1%84%87%E1%85%A2%E1%86%A8%E1%84%8C%E1%85%AE%E1%86%AB1769_3%E1%84%8B%E1%85%B4%E1%84%87%E1%85%A2%E1%84%89%E1%85%AE.png)


---
### 풀이

[3의배수](https://www.acmicpc.net/problem/1769)

- 문자열 각 자릿수를 따서 더하고 한 자릿수가 되면 3의 배수인지 검사하면 된다. </br>

- **요점** : String이 Character형 배열이라는 사실을 알면 풀이가 쉽다.</br>

- **함정** : 조건이 백만자릿수가 입력된다는 것. Int형으로는 10의 백만승 숫자를 받을 수 없다. -> 따라서 String 타입을 써줘야한다. </br>
---
### 코드
``` java
package Reculsive;

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

```





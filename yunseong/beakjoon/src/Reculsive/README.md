# 재귀함수

[1. 개념](#개념)
[2. 문제](#문제)
[3. 백준 10872 팩토리얼](#백준-10872-팩토리얼)
[4. 백준 1769 3의배수](#백준-1769-3의배수)
[5. 백준 16974 레벨햄버거](#백준-16974-레벨햄버거) 

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

### 백준 1769 3의배수

![](https://images.velog.io/images/oh_yunseong/post/be84e2ee-ed59-4b0e-be83-42790589118f/%E1%84%87%E1%85%A2%E1%86%A8%E1%84%8C%E1%85%AE%E1%86%AB1769_3%E1%84%8B%E1%85%B4%E1%84%87%E1%85%A2%E1%84%89%E1%85%AE.png)


---
### 풀이

[3의배수] (https://www.acmicpc.net/problem/1769)</br>
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


---
### 백준 16974 레벨햄버거

![](https://images.velog.io/images/oh_yunseong/post/46724161-737d-4742-8eab-f7269b566f85/%E1%84%87%E1%85%A2%E1%86%A8%E1%84%8C%E1%85%AE%E1%86%AB16974_%E1%84%85%E1%85%A6%E1%84%87%E1%85%A6%E1%86%AF%E1%84%92%E1%85%A2%E1%86%B7%E1%84%87%E1%85%A5%E1%84%80%E1%85%A5.png)

---

## 해석과정
[레벨햄버거](https://www.acmicpc.net/problem/16974)</br>
- B는 빵이고, P는 패티를 의미한다. </br>
- 레벨 0 햄버거는 P하나만 존재한다. </br>
- 햄버거의 구성은 **B+레벨-1+P+레벨-1+B**의 구조이다. </br>
예) 레벨5 햄버거 : B+레벨4버거+P+레벨4버거+P가 된다.</br>
여기서 재귀가 발생한다. </br>
- ***이 버거를 밑에서부터 X개를 셀때 패티의 갯수를 구하는 문제이다.***</br>

처음에는 String을 활용해 햄버거구조를 단순 재귀로 구현한 뒤 패티의 갯수를 세려고 했다. 2^n으로 재귀가 반복돼 나중에는 정말 큰 문자열이 생겨난다. 따라서 에러가 발생하게 됐다.</br>

## 풀이

> 💡 조건을 잘 짜서 반씩 줄여나가면서 패티 수를 세어나가면 된다!</br>

- 현재레벨이 0인 경우 -> 패티 하나만 있음</br>
- 현재레벨이 0이 아닌 경우 -> 레벨 햄버거</br>
	1. X가 1일때 </br>
    2. X가 총 B,P의 반 보다 작을 때 -> 반 이후는 버리고 재귀호출</br>
    3. X가 총 B,P의 반과 같을 때 -> 이전레벨의 총패티수 + 1 반환</br>
    4. X가 총 B,P의 반보다 클 때 -> 반 이전 패티수 + 재귀호출  </br>
    5. X가 총 B,P와 같을때 -> 총 패티수 반환</br>
> 💡 경우의 수에 대한 자세한 규칙은 코드로 확인하하면 된다.</br>
- 총 B,P 수와 P수 구하는 법은 배열에 1부터 N까지 버거규칙을 돌려서 구하면된다. </br>
- 예상으로는 반씩 줄여나가는 식으로 </br>
---
## 코드

``` java
package Reculsive;
import java.util.Scanner;


//레벨-0 버거는 패티만으로 이루어져 있다.
//	레벨-L 버거는 B, 레벨-(L-1) 버거, P, 레벨-(L-1)버거,B으로 이루어져 있다. (L ≥ 1)
//	예를 들어, 레벨-1 버거는 'B P P P B', 레벨-2 버거는 'B BPPPB P BPPPB B'와 같이 생겼다. (B는 햄버거번, P는 패티)
//
//	상도가 상근날드에 방문해서 레벨-N 버거를 시켰다. 상도가 햄버거의 아래 X장을 먹었을 때, 먹은 패티는 몇 장일까? 한 장은 햄버거번 또는 패티 한 장이다.
public class Bj16974_LevelBurger {

		private static long[] total;
		private static long[] patty;	
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long X = sc.nextLong();
			
			total = new long[N+1];
			patty = new long[N+1];
			
			total[0] = 1 ; patty[0] = 1; // 총재료수랑 패티갯수 구하기 위해 처음 패티한장있는걸 초기화 해줌  
			
			for(int i = 1 ; i <= N ; i++) {
				total[i] = 1+total[i-1]+1+total[i-1]+1;//N이 1, 2, 3,...일 경우를 차례로 배열에 갯수를 저장해줌
				patty[i] = patty[i-1]+1+patty[i-1];//빵말고 패티만 갯수 추가 
			}
			
			System.out.println(CountPatty(N, X));
			
		}
		//1 p
		//5 BPPPB
		//  BBPPPB P BPPPBB
		public static long CountPatty(int N, long X) {
			if(N==0) {
				if(X==0) return 0; //레벨도 0이고 한장도 안먹었을 경우
				else return 1; //레벨 0인데 한장 먹었을 경우
			} 
			//N->0이 아닐때 x장 먹었을때 먹은 패티 수 구하기 
			if(X==1) return 0;//일단 한장 먹으면 맨밑에 빵이라 패티 0개 먹음 ㅋㅋ
			else if(X <= 1+total[N-1] ) { //중앙 패티 P보다 작은 경우 -> 현재의 반은 이전레벨에 빵하나만 더한것이기 때문에 이전 호출 +1(빵)을 해준것
				return CountPatty(N-1, X-1);//이전 빵보다 작기 때문에 이전빵으로 다시비교하기 위해 + x-1은 맨앞의빵은 셀 필요가 없어서
			}else if(X == 1+total[N-1]+1 ) {//반 + 1(중앙패티) == X값이 중앙값과 같을 때
				return patty[N-1]+1;//이전거 패티에 +1(패티)만 해주면 됨
			}else if(X < total[N]) {//반 +1(중앙패티) <= X값이 중앙값보다 클때
				return patty[N-1]+1+CountPatty(N-1, X-(1+total[N-1]+1)); //반보다 크면 반까진 이전레벨패티갯수로 세고 나머지X는 이전레벨 총 재료+빵+패티만큼 줄인다음에 재귀하면 된다.
			}else {//X가 total 이랑 같을때 
				return patty[N];
			}
			 
			
			//N = 4, x = 5 // N=2 x=4
		}


}

```






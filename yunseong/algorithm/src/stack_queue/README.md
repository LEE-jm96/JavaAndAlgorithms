# 스택&큐

[1. 개념](#개념)</br>
[2. 문제](#문제)</br>
[3. 프로그래머스 레벨2 주식가격](#프로그래머스-레벨2-주식가격)</br>


## 개념
> 💡자료구조는 데이터를 보다 효율적으로 다루기 위한 구조를 의미합니다.</br>
표준화된 클래스들을 제공해주기 때문에 구조를 구현하지 않고도 편하게 사용할 수 있습니다.</br>
>>
- Stack&Queue는 Collection의 대표적인 예 입니다.</br>
- 이외에 List, Map, Set 인터페이스를 기준으로 여러 구현체가 존재합니다. </br>

## 문제링크
> [주식가격](https://programmers.co.kr/learn/courses/30/lessons/42584)</br>

## 프로그래머스 레벨2 주식가격

![](https://images.velog.io/images/oh_yunseong/post/edcbbf86-b27a-4fe7-bcf9-13599f24d7c3/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202022-02-04%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2012.08.18.png)

## 해설

> 배열에 주식가격이 담겨져서 주어진다. 인덱스 하나차이를 1초차이라고 가정한다. 그리고 첫 번째 인덱스부터 몇초동안 안떨어지는지 계산하는 문제이다. 
>>
1. 스택에는 인덱스를 넣어준다.
2. 주식가격 배열의 순번은 스택의 순번보다 하나 앞서나가게 됩니다.
3. 스택의 순번과 배열의 순번을 비교해줍니다. 스택의 순번이 더크면 가격이 떨어졌다는 뜻입니다.
4. 그러면 해당 순번과 스택순번과의 차이를 답 배열에 넣어줍니다.
5. 그렇게 스택순번을 pop()하고 그 스택과 2,3,4번 과정을 반복합니다.
6. 그리고 가격이 떨어지지 않은 순번은 끝까지 가격이 안떨어진 것이기 때문에 꺼내서 계산해주면 끝!


## 코드

``` java
31 lines (25 sloc)  954 Bytes
   
package stack_queue;

import java.util.Stack;

public class ProLv2_StockPrice {//주식가격

	public static void main(String[] args) {
		int[] prices = {5,3,2,2,5,4,6};
		int[] answer = solution(prices);
		for(int i = 0; i< answer.length ; i++) System.out.print(answer[i]+ " ");
	}
	
	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<Integer>();//스택생성
		
		for(int i = 0; i < prices.length; i++) {//배열전체를 반복한다.
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {//스택이 비어있지 않으면서 다음것보다 전것이 클때(주식가 상승) 
				answer[stack.peek()] = i - stack.peek();//answer[2]=1;
				stack.pop();//0,1
			}
			stack.push(i);//0,1,2 들어가고 0,1,3,4
		}
		while(!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() -1;//5 - 4 - 1, 0,1,1,3,4
			stack.pop();
		}
		return answer;
	}
	
}
```









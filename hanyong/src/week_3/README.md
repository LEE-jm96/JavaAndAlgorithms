# 2주차_자료구조 (1/31 ~ 2/4)
------------------------
## 1. 개념
------------------------
### 1. 스택(stack)
> - 리스트의 한쪽 끝에서만 삽입과 삭제가 수행 가능한 자료구조 -> 후입선출(LIFO)
> - JAVA의 경우 java.util.Stack을 이용하여 stack 생성 가능.
>> #### 메소드 정리
>> push()   : 데이터 삽입 </br>
>> pop()    : 마지막 삽입한 데이터 삭제 </br>
>> peek()   : 마지막 삽입한 데이터 조회 </br>
>> size()   : 삽입된 데이터 개수 </br>
>> empty()  : 스택이 비었는지 조회 </br>
>> search() : 인자로 받은 데이터 위치 조회 </br>
>> clear()  : 삽입된 데이터 초기화 </br>

### 2. 큐(Queue)
> - 뒤에서는 삽입 앞에서는 삭제만 수행 가능한 형태 넣은 순서대로만 출력 가능한 자료구조 -> 선입선출(FIFO)
> - JAVA의 경우 java.util.Quene을 이용하여 Queue 생성 가능(LinkedList형태로 구현 -> LinkedList를 반드시 import 해줘야 함.)
>> #### 메소드 정리
>> | 기능 | Throws exception | Return special value |
>> | ------ | --------- | --------- |
>> | 삽입 | add(e) | offer(e) |
>> | 삭제 | remove() | poll() |
>> | 조회 | element() | peek() |
>> - Throws exception     : 큐가 비어 있다면 예외 발생. </br>
>> - Return special value : 큐가 비어 있다면 null 반환. </br>

> #### 2-1.우선순위 큐(Priority Queue)
> - 우선순위를 결정하고 우선순위가 높은 요소를 먼저 처리하는 구조.
> - 내부 요소는 이진트리 구조로 이루어져 있음.
>> 낮은 숫자부터 처리 : new PriorityQueue<>(); </br>
>> 높은 숫자부터 처리 : new PriorityQueue<>(Collections.reverseOrder()); </br>


## 2. 문제
-------------------------
> 2/7, 백준 알고리즘 : [괄호 끼워넣기](https://www.acmicpc.net/problem/11899) </br>
> 2/8, 백준 알고리즘 : [균형잡힌 세상](https://www.acmicpc.net/problem/4949) </br>
> 2/9, 백준 알고리즘 : [스택수열](https://www.acmicpc.net/problem/1874) </br>
> 2/10, 백준 알고리즘 : [키로거](https://www.acmicpc.net/problem/5397) </br>
> 2/11, 백준 알고리즘 : [앵무새](https://www.acmicpc.net/problem/14713) </br>

------------------------

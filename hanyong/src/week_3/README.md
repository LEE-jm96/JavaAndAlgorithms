# 3주차_자료구조 (2/7 ~ 2/11)
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

> #### 2-1.선형 큐(Linear Queue)
> - 기본적인 형태의 막대모양 큐.
> - 크기가 제한되어 있고 빈 공간을 사용하려면 모든 자료를 꺼내거나 자료를 한칸 씩 옮겨야 .
>> Enqueue 큐에 데이터를 삽입합니다. </br>
>> Dequeue 큐에서 데이터를 꺼내옵니다. </br>

> #### 2-2.원형 큐(Circular Queue)
> - 원형큐는 큐의 SIZE, front, rear를 이용하여 선형큐의 문제점을 보완하기 위해 만들어진 자료구조.
> - 원형큐에서는 포인터 증가 방식이 (rear+1)%arraysize 형식이기 때문에 Dequeue로 발생한 배열의 빈 공간을 활용 가능. 
> -   
>> Enqueue : rear의 포인터를 1증가 시키고 그 위치에 데이터 삽입, rear+1이 배열의 끝이고 포화상태가 아니라면 배열의 첫 번째 인덱스에 데이터를 삽입 </br>
>> Dequeue :  </br>

> #### 2-3.우선순위 큐(Priority Queue)
> - 우선순위를 결정하고 우선순위가 높은 요소를 먼저 처리하는 구조.
> - 데이터를 삽입할 때 우선순위에 따라 정렬하여 삽입한 후 한쪽 방향에서만 데이터를 꺼내어 쓰도록 작성되어 있음.
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

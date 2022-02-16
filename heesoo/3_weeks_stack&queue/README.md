# Stack & Queue
## Stack : 한쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료구조
          -LinkedList로 구현 가능
          -push(), pop(), clear(), peek(), size(), empty(), contains()
## Queue : 한쪽 끝에서는 삽입연산만 이루어지며 다른 한쪽 끝에서는 삭제연산만이 이루어지는 FIFO(First In Fist Out) 형식의 자료구조
          -일차원배열(원형 큐), LinkedList로 구현가능
          -offer(), add(), poll(), remove(), clear(), peek(), element()


## 20220207 - 괄호 끼워넣기 (백준 알고리즘 11899)
- Stack 사용
- 올바른 괄호열 만들기위해 추가해야할 괄호의 최소 개수

## 20220208 - 균형잡힌 세상 (백준 알고리즘 4949)
- Stack 사용
- 소괄호와 대괄호 짝이 맞으면 yes, 아니면 no

## 20220209 - 스택수열 (백준 알고리즘 1874)
- Stack 사용
- 입력된 수열을 만들기 위한 push연산과 pop연산을 하며 push연산시 +, pop연산시 -를 출력
- 이전 값보다 현재의 값이 크거나 같으면 스택에 push, 스택의 top 값이 현재의 값보다 크거나 같으면 push를 하고 StringBuilder에 append

## 20220210 - 키로거 (백준 알고리즘 5397)
- Stack 사용
- '-', '<', '>'를 문자열과 함께 입력하고 '-'는 백스페이스, '<', '>'는 화살표로 커서의 오른쪽과 왼쪽 위치 이동
- 문자열을 입력받는 스택과 임시 스택을 만들어 커서의 움직임을 표현하고 StringBuffer를 이용해 문자열 줄력

## 20220211 - 앵무새 (백준 알고리즘 14713)
- HashMap, Queue 사용
- 여러문장을 입력받고 문장들의 단어가 섞인 문자열이 입력받은 문자열 순서가 올바른지, 단어의 유무를 확인하여 Possible, Impossible을 출력
- 입력 받은 문자열을 Queue에 넣고 단어가 섞인 문자열도 Queue에 넣어 각각 Queue의 front의 값을 비교하여 poll을 한다.
- 모든 queue가 비어져있거나 입력받은 단어만큼 단어가 섞인 문자열에서 poll될 경우를 확인
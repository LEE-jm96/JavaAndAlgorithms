# Sort(정렬)
## Sort : 항목들을 체계적으로 정리하는 과정
          - 순서를 정하는 것
          - 분류하는 것

### 선택정렬 (Selection Sort) O(n^2)
    : 전체 원소들 중에서 기준 위치에 맞는 원소를 선택하여 자리를 교환하는 방식이다.
      
      1) 주어진 배열에서 최솟값을 찾는다.
      2) 그 최솟값을 맨 앞에 위치한 것과 바꾼다.
      3) 맨 앞의 것을 제외하고 나머지 것들을 대상으로 1) ~ 2) 과정을 반복한다.

### 버블정렬 (Bubble Sort) O(n^2)
    : 인접한 두 개의 원소를 비교하여 자리를 교환하는 방식이다.
      (한 단계가 끝나면, 가장 큰 원소 혹은 가장 작은 원소가 마지막 자리로 위치한다.)

      1) 첫 번째 원소부터 인전한 원소끼리 자리를 교환하는 과정을 반복한다.

### 삽입정렬 (Insertion Sort) O(n^2)
    : 정렬되어 있는 부분집합에 정렬할 새로운 원소의 위치를 삽입하는 방법이다.
     
       1) 2번째 인덱스부터 시작해 선택 원소와 나머지 원소를 비교한다. (선택원소가 더 크면 비교를 진행하지 않는다)
       2) 선택 원소가 작을 경우 앞에 있던 원소를 한칸 뒤로 밀고 선택원소는 그보다 한칸 더 앞에 있던 원소와 비교를 한다.


### Arrays.sort()
    : java.util.Arrays 클래스의 sort() 메서드이다. (Dual-Pivot Quick Sort 사용 <= InsertionSort + QuickSort)
      소량 데이터 처리나, 순서 규칙적인 경우 Arrays.paralleSort()보다 성능이 좋다.

### Arrays.parallelSort()
    : java.util.Arrays 클래스의 paralleSort() 메서드이다. (Merge Sort 사용)
      배열을 병렬로 정렬하는 기능 제공한다.
      대량 데이터 처리가 Arrays.sort()보다 성능이 좋다.

### Collections.sort()
    : java.util.Collections 클래스의 sort() 메서드이다. (Tim Sort 사용 <= InsertionSort + MergeSort)
      리스트를 정렬하는 기능을 제공한다.
      평균적으로 Arrays.sort()보다 성능이 좋다.
      
      
## 20220214 - 수 정렬하기 2 (백준 알고리즘 2751) 
- 입력하는 수를 오름차순으로 정렬한다.
- String 보다 StringBuffer, StringBuilder를 이용하여 속도를 줄인다. (String < StringBuffer < StringBuilder)-성능



      
       

package sort;

import java.util.*;
public class Baekjoon_10867{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr= new int[num];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);		

		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < i + 2; j++){
				if(arr[i] != arr[j]){
					answer.add(arr[j]);
				}
			}
		}

		Iterator iter = answer.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + " ");
		}
	}
}

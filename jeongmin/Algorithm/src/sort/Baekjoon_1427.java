package sort;

import java.util.*;
public class Baekjoon_1427{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		int num = sc.nextInt();
		
		String temp = Integer.toString(num);
		int[] arr = new int[temp.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = temp.charAt(i) - '0';
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] < arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		String str = Arrays.toString(arr).replaceAll("[^0-9]","");
		System.out.println(str);
	}
}

package dp;

import java.util.Scanner;

public class Baekjoon_2670 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double answer = 0;
		double[] arr= new double[num];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			double max = arr[i];
			double temp = arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				if(max < temp * arr[j]) {
					max = temp * arr[j];
					temp = temp * arr[j];
				}
				else if(max > temp *arr[j]) {
					temp = temp * arr[j];
				}
			}
			if(answer < max) answer = max;
		}
		
		System.out.printf("%4.3f", answer);
	}
}

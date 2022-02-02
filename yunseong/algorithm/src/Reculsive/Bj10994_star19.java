package Reculsive;

import java.util.Scanner;

public class Bj10994_star19 {
	private static String [][] star;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1, 5, 9, 13,...
		//1+(N-1)*4;
		int N = sc.nextInt();
		int format = 1+(N-1)*4;
		star = new String[format][format];//2 [5][10];
		
		for(int i = 0 ; i < star.length; i++) {
			for(int j = 0; j < star[i].length ; j ++) {
				star[i][j] = " ";
			}
		}
		
		int startI = 0, startJ = 0;
		star(N, startI, startJ);
		
		
		for(int i = 0 ; i < star.length; i++) {
			for(int j = 0; j < star[i].length ; j ++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		//5 -> 10
	}
	public static void star(int N, int startI, int startJ) {
		int format = 1+(N-1)*4;
		if(N==1) {
			star[startI][startJ] = "*";
			return;
		}else {
			for(int i = startI ; i<format+startI; i++) {//0일땐 ~흘러가고 5
				for(int j = startJ; j<format +startJ; j++) {
					if(i==startI||i==(format)-1+startI) star[i][j] = "*";
					else {
						if(j==startJ||j==format-1+startJ) star[i][j] = "*";
					}
				}
			}
			star(N-1, startI+2, startJ+2);
	}
	

	}
	
	
	

}

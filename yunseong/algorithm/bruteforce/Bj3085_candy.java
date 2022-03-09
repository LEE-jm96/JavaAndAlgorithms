package algorithm.bruteforce;


import java.util.*;

public class Bj3085_candy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n ; i++) {
            String str = s.next();
            for (int j = 0; j < n; j++) arr[i][j] = str.charAt(j);
        }
        List<Integer> list = switching(arr);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list.get(0));

    }
    public static List<Integer> switching(char[][] arr){
        List<Integer> list = new ArrayList<>();
        char[][] origin = arr;

        for(int i = 0 ; i < arr.length ;i++) {
            for(int j = 0 ; j < arr.length-1 ; j++) {
                if (arr[i][j] != arr[i][j + 1]) {
                    char temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                    list.add(checking(arr));
                    arr = origin;
                }
            }
        }
        for(int i = 0 ; i < arr.length ;i++) {
            for(int j = 0 ; j < arr.length-1 ; j++) {
                if (arr[j][i] != arr[j+1][i]) {
                    char temp = arr[j][i];
                    arr[j][i] = arr[j+1][i];
                    arr[j+1][i] = temp;
                    list.add(checking(arr));
                    arr = origin;
                }
            }
        }
        return list;

    }
    public static int checking(char[][] arr) {
        int answer = 1;
        int sum = 1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    sum++;
                }
            }
            if(answer < sum){
                answer = sum;
            }
            sum = 1;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j][i] == arr[j+1][i]) {
                    sum++;
                }
            }
            if(answer < sum){
                answer = sum;
            }
            sum = 1;
        }
        return answer;
    }
}
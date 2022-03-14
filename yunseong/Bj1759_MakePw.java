import java.util.Arrays;
import java.util.Scanner;

public class Bj1759_MakePw {
    static int c,l;
    static char[] arr;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        c = sc.nextInt();
        arr = new char[c];
        result = new int[c];
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        for(int i = 0 ; i < c ; i++) {
            arr[i] = str[i].charAt(0);
        }
        Arrays.sort(arr);
        DFS(0,0,0,0);
    }

    public static void DFS(int start, int depth, int ja, int mo) {
        for(int i = start ; i < c ; i ++) {
            result[i] = 1;
            DFS(i+1, depth +1, ja+(!check(arr[i])?1:0), mo+(check(arr[i])?1:0));
            result[i] = 0;
        }
        if(depth == l && ja >= 2 && mo >= 1){
            print();
        }
    }
    public static void print() {
        for (int i = 0; i < c; i++) {
            if (result[i] == 1) System.out.print(arr[i]);
        }
        System.out.println();
    }


    public static boolean check(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            return true;
        else
            return false;
    }
}

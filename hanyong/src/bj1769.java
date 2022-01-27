import java.util.Scanner;

public class bj1769 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String num = sc.nextLine();
        sumf(num,count);
    }
    public static void sumf(String num, int count) {
        int sum = 0;
        if(num.length()>1) {
            for(int i = 0; i < num.length(); i++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            count++;
            sumf(String.valueOf(sum),count);
        }else{
            if(Integer.parseInt(num) % 3 == 0 && Integer.parseInt(num) != 0) {
                System.out.println(count);
                System.out.println("YES");
            }else {
                System.out.println(count);
                System.out.println("NO");
            }
        }
    }
}

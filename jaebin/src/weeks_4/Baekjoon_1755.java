package weeks_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 알고리즘 1755번 : 숫자놀이, 정렬
public class Baekjoon_1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // 영어로 출력인줄 알았다.
        String[] arr = new String[n - m + 1];
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = m; i < n + 1; i++) {
            if (String.valueOf(i).length() == 1) {
                arr[index] = str[i];
                index++;
            } else {
                String temp = String.valueOf(i);
                int a = Character.getNumericValue(temp.charAt(0));
                int b = Character.getNumericValue(temp.charAt(1));
                sb.append(str[a]);
                sb.append(" ");
                sb.append(str[b]);
                arr[index] = sb.toString();
                index++;
                sb.delete(0, sb.length());
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].split(" ");
            int result = 0;
            int len = temp.length;
            if (len > 1) {
                for (int j = 0; j < len; j++) {
                    for (int k = 0; k < str.length; k++) {
                        if (str[k].equals(temp[j])) {
                            result = result + k;
                            break;
                        }
                    }
                    if (j != len - 1)
                        result = result * 10;
                }
            } else {
                for (int j = 0; j < str.length; j++) {
                    if (str[j].equals(temp[0])) {
                        result = j;
                        break;
                    }
                }
            }
            System.out.print(result + " ");
            if ((i + 1) % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}

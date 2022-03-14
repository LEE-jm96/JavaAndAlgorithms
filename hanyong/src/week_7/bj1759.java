package week_7;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1759 {
    static char[] pwd;
    static int[] check;
    static int l;
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        pwd = new char[c];
        check = new int[c];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            pwd[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(pwd);
        makePwd(0,0);
    }
    public static void makePwd(int level, int length) {
        if(length == l) {
            StringBuilder sb = new StringBuilder();
            int vowel = 0;
            int consonant = 0;
            for (int i = 0 ; i < c; i++) {
                if (check[i] == 1) {
                    if (check(pwd[i])) {
                        vowel++;
                    }else {
                        consonant++;
                    } sb.append(pwd[i]);
                }
            }
            if (vowel >= 1 && consonant >= 2) {
                System.out.println(sb);
            }
        }else{
            for(int i = level; i < c; i++) {
                check[i] = 1;
                makePwd(i+1, length+1);
                check[i] = 0;
            }
        }
    }

    public static boolean check(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }else{
            return false;
        }
    }


}

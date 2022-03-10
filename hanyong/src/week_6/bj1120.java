package week_6;

import java.io.*;
import java.util.StringTokenizer;

public class bj1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        int result = str1.length();
        for(int i=0;i<str2.length()-str1.length()+1;i++){
            int temp=0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j)!=str2.charAt(j+i)){
                    temp++;
                }
            }
            if(result > temp){
                result = temp;
            }
        }
        System.out.println(result);
    }
}

package weeks_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 알고리즘 : 9935번, 문자열 폭발
public class Baekjoon_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String allS = br.readLine();
        String partS = br.readLine();

        LinkedList<Character> stk = new LinkedList<Character>();
        //연결리스트이기때문에 인덱스를 잘봐야합니다.

        for (int i = 0; i < allS.length(); i++) {
            stk.push(allS.charAt(i));
            boolean isSame = true;

            if (stk.size() >= partS.length()) {
                for (int j = 0; j < partS.length(); j++) {
                    if (stk.get(partS.length()-j-1 ) != partS.charAt(j)){
                        isSame = false;
                        break;
                    }
                }
                if (isSame == true){
                    for (int j = 0; j < partS.length(); j++) {
                        stk.pop();
                    }
                }
            }

        }

        if (stk.size() == 0) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : stk) {
                sb.append(c);
            }
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}

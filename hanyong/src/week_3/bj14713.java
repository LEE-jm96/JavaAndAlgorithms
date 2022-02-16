package week_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 각각의 앵무새들을 모두 큐로 생성
 * 목표 문장에서 현재 나와야하는 단어를 말 할 수 있는 앵무새(큐)를 찾아서 해당 단어 삭제
 * 말할 수 있는 앵무새가 없을때 + 모든 큐가 비어있다면 possible / 큐에 단어가 남았다면 impossible
 */
public class bj14713 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        HashMap<Integer,LinkedList> p_list = new HashMap<>();
        LinkedList<String> parrot;
        Queue<String> word = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());
        boolean flag = false;
        for (int i = 0; i < num; i++) {
            parrot = new LinkedList<>();
            input(parrot);
            p_list.put(i,parrot);
        }
        input(word);
        loop:
        while(true){
            flag = false;
            if(!word.isEmpty()){
                for (int i = 0; i < p_list.size(); i++) {
                    if(word.peek().equals(p_list.get(i).peek())){
                        ((LinkedList<String>) word).pop();
                        p_list.get(i).pop();
                        flag = true;
                    }
                    if(p_list.get(i).isEmpty()){
                        p_list.remove(i);
                        for (int j = i; j < p_list.size(); j++) {
                            p_list.put(j,p_list.get(j+1));
                            p_list.remove(j+1);
                        }
                        break;
                    }
                }
                if(flag == false){
                    System.out.println("Impossible");
                    break loop;
                }
            }
            if(p_list.isEmpty() && word.isEmpty()){
                System.out.println("Possible");
                break;
            }else if((p_list.isEmpty() && !word.isEmpty()) || (!p_list.isEmpty() && word.isEmpty())){
                System.out.println("Impossible");
                break;
            }
        }


    }
    public static void input(Queue word) throws IOException{
        String s = br.readLine();
        String[] arr = s.split(" ");
        for (int j = 0; j < arr.length; j++) {
            word.offer(arr[j]);
        }
    }
}

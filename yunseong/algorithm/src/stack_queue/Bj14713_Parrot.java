package algorithm.src.stack_queue;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Bj14713_Parrot {

    public static void main(String[] args) throws IOException {

        ArrayList<Queue<String>>  Plist = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n ; i++){
            Queue<String> q = new LinkedList<>();
            String string = br.readLine();
            String[] st = string.split(" ");
            for (int k = 0 ; k < st.length ; k++) {
                q.offer(st[k]);
            }
            Plist.add(q);
        }

        String question = br.readLine();

        String[] qArr = question.split(" ");

        boolean f = true;
        for (int i = 0; i < qArr.length; i++) {
            if(!f) {
                break;
            }
            for(int k = 0; k < Plist.size() ; k++) {
                f = false;
                if(!(Plist.get(k).isEmpty()) && Plist.get(k).peek().equals(qArr[i])){//0,
                    Plist.get(k).poll();
                    f = true;
                    break;
                }
            }
        }
        while (!Plist.isEmpty()) {
            if(Plist.get(0).isEmpty()) {
                Plist.remove(0);
            }else{
                break;
            }
        }
        if(f && Plist.isEmpty()) {
            System.out.println("Possible");
        }else {
            System.out.println("Impossible");
        }


    }
}

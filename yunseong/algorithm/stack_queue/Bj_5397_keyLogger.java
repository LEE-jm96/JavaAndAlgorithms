package algorithm.stack_queue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Bj_5397_keyLogger {

	public static void main(String[] args) throws IOException {
		//BAPC<<A< degBCAP degBhCAP
		//dd<<>deg>h  ddegdh
		//ddegdh-                
		//dddddd     ee
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		Stack<Character> sub = new Stack<Character>();
		//BA<-PCd-C
		//PCCA   A
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			
			String input = sc.next();
			for(int j = 0 ; j < input.length() ; j++) {
				
				char c = input.charAt(j);
				
				if(c!='<' && c!='>' && c!='-') {
					s.push(c);
					continue;
				}
				if(c=='<') {
					if(!s.isEmpty()) {
						sub.add(s.pop());
					}
					
				}
				if(c=='>') {
					if(!sub.isEmpty()) {
						s.add(sub.pop());
					}
				}
				if(c=='-') {
					if(!s.isEmpty()) {
						s.pop();
					}
				}
				
			}
			
			while(!sub.isEmpty()) {
				s.push(sub.pop());
			}
			
			StringBuilder answer = new StringBuilder();
			while(!s.isEmpty()) {
				answer.append(s.pop());
			}
			System.out.println(answer.reverse());
		}
		
		
	}
}

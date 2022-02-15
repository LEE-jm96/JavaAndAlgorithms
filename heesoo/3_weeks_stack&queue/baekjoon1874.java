import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class baekjoon1874 {   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());                   
                 
        int[] arr;            
        Stack<Integer> stack;    
        
        arr = new int[N];
        stack = new Stack<Integer>();
        
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        int num = 1;  
        for(int i=0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            
            if(flag) {
                
                if(num <= arr[i]) {// num을 arr[i]까지 증가시키고 스택 push
                    while(num <= arr[i]) {
                        stack.push(num++);
                        sb.append("+ \n");
                    }
                }
                if(stack.isEmpty()) flag = false; 
                else {
                    while(stack.peek() >= arr[i]) { //top의 값 배열의 값보다 크면 스택 pop
                        stack.pop();
                        sb.append("- \n");
                        if(stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
        }
        if(flag) {
            System.out.println(sb.toString());
        }else {
            System.out.println("NO");
        }
    }
}

package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        int sum=0;
        for(int i=0; i<K; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0 && !stack.isEmpty()  ){
                stack.pop();
            }
            else{
                stack.push(n);
            }
        }
        while(!stack.isEmpty()){
            sum += (int) stack.pop();
        }
        System.out.println(sum);
    }
}

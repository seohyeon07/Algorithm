import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class sequence {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sequencevalue = 1;
        Stack <Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            int given = Integer.parseInt(br.readLine());
            while(sequencevalue<=given){
                stack.push(sequencevalue);
                sequencevalue++;
                sb.append("+").append("\n");
            }
            if(stack.peek()==given){
                stack.pop();
                sb.append("-").append("\n");
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }

}

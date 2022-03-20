import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class rightBig {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack <Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] A = new int [N];
        int[] ans = new int[N];

        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for(int i=1; i<N; i++){
            if(stack.empty()){
                stack.push(i);
            }
            while(!stack.empty() && A[stack.peek()]<A[i]){
                ans[stack.peek()]=A[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            ans[stack.peek()]=-1;
            stack.pop();
        }
        for(int i=0; i<N; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);

    }
}

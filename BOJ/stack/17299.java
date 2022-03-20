import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class rightBigcount {
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] input = new int [1000001];
        int [] count = new int [1000001];
        int [] ans = new int [1000001];
        Stack <Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            input[i]=Integer.parseInt(st.nextToken());

        }
        for(int i=0; i<N; i++){
            count[input[i]]++;
        }
        stack.push(0);
        for(int i=1; i<N; i++){
            if(stack.empty()){
                stack.push(i);
            }
            while(!stack.empty() && count[input[stack.peek()]]<count[input[i]] ){
                ans[stack.peek()]=input[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            ans[stack.pop()]=-1;
        }
        for(int i=0; i<N; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);



    }
    
}

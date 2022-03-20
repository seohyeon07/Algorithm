import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class stick {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String str = br.readLine();
        Stack <Character> stack = new Stack<>();
        
        int ans=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                stack.pop();
                if(str.charAt(i-1)=='('){
                    ans+=stack.size();
                }
                else{
                    ans++;
                }

            }
        }
        System.out.println(ans);
    }
}
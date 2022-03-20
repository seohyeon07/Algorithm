import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bracket {
    public static String check(String vps){
        Stack <Integer> stack = new Stack<>(); 
        String ans ="YES";
        vps = vps+"\n";
        for(int i=0; i<vps.length(); i++){
            if(vps.charAt(i)=='('){
                stack.push(i);
            }
            if(vps.charAt(i)==')' && !stack.empty()){
                stack.pop();
            }
            else if(vps.charAt(i)==')' && stack.empty()){
                ans ="NO";
            }
            else if(!stack.empty() && vps.charAt(i)=='\n'){
                ans ="NO";
            }
        }
        return ans+"\n";
        
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String vps = br.readLine();
            bw.write(check(vps));
        }
        bw.close();
    }
}

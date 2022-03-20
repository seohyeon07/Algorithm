import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class wordReverse2 {
    public static void main(String[]args) throws IOException{
        Stack <Character> Lstack = new Stack<>();
        //Stack <Character> Rstack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        S=S+'\n';
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='<'){
                while(!Lstack.empty()){
                    sb.append(Lstack.pop());
                }
                while(S.charAt(i)!='>'){
                    sb.append(S.charAt(i));
                    i++;
                }
                sb.append(S.charAt(i));
            }
            else if((S.charAt(i)-'0'>= 0 && S.charAt(i)-'9'<=9) ||( S.charAt(i)-'a'>=0 && S.charAt(i)-'z'<=25)){
                Lstack.push(S.charAt(i));
            }
            else if(S.charAt(i)==' ' || S.charAt(i)=='\n'){
                while(!Lstack.empty()){
                    sb.append(Lstack.pop());
                }
                if(S.charAt(i)==' '){
                    sb.append(' ');
                }
            }
        }
        System.out.println(sb);
    }
}

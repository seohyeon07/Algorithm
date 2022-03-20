import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class editer {
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack <Character> Lstack = new Stack<>();
        Stack <Character> Rstack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<str.length(); i++){
            Lstack.push(str.charAt(i));
        }
        for(int i=0; i<M; i++){
            String given = br.readLine();
            
            if(given.equals("L")){
                if(Lstack.empty()){
                    continue;
                }
                Rstack.push(Lstack.pop());
            }
            if(given.equals("D")){
                if(Rstack.empty()){
                    continue;
                }
                Lstack.push(Rstack.pop());
            }
            if(given.equals("B")){
                if(Lstack.empty()){
                    continue;
                }
                Lstack.pop();
            }
            if(given.charAt(0)=='P'){
                Lstack.push(given.charAt(2));
                
            }
        }
        while(!Lstack.empty()){
            Rstack.push(Lstack.pop());
        }
        while(!Rstack.empty()){
            sb.append(Rstack.pop());
        }
        System.out.println(sb);
    }
}

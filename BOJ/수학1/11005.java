import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Number2 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String ans="";
        while(N>0){
            int res=N%B;
            if(res >=10){
                ans += (char)(res-10 + (int)'A');
            }
            else{
                ans+=(char)(res + (int)'0');
            }
            N/=B;
        }
        for(int i=ans.length()-1; i>=0; i--){
            sb.append(ans.charAt(i));
        }
        System.out.println(sb);
    }
    
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM {
    
    static int GCD(int A, int B){
        int tmp=0;
        if(B!=0){
            tmp=A%B;
            A=B;
            B=tmp;
            return GCD(A,B); 
        }
        else{
            return A;
        }
    }
    static int L(int A, int B){
        return A*B/GCD(A, B);
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(L(A,B)).append("\n");
        }
        System.out.print(sb);
    }    
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDSum {

    static int GCD(int a, int b){
        int tmp=0;
        if(b!=0){
            tmp=a%b;
            a=b;
            b=tmp;
            return GCD(a,b);
        }
        else{
            return a;
        }
        
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        

        for(int i=0; i<t; i++){
            long ans=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count=Integer.parseInt(st.nextToken());
            int [] number = new int [count];
            for(int j=0; j<count; j++){
                number[j]=Integer.parseInt(st.nextToken());
            }
            for(int k=0; k<number.length; k++){
                for(int l=k+1; l<number.length; l++){
                   ans += GCD(number[k],number[l]);
                }
                
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);

    }
    
}

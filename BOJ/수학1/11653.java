import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorization {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        boolean [] check = new boolean[10000001];
        
        for(int i=0; i<10000001; i++){
            if(i<=1){
                check[i]=false;
            }
            else{
                check[i]=true;
            }
        }
        for(int i=0; i<10000001; i++){
            if(check[i]==true){
                for(int j=2; i*j<10000001; j++){
                    check[i*j]=false;
                }
            }
        }
        for(int i=1; i<10000001; i++){
            if(check[i]==true){ 
                while(N%i==0){
                    sb.append(i).append("\n");
                    N/=i;
                }
                if(N==1){
                    System.out.print(sb);
                    return;
                }
            }
        }
    }
}

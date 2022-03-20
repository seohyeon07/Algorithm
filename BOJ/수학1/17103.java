import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class GoldPartition {
    public static void main(String[]arags)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        boolean [] check = new boolean[1000001];
        for(int i=0; i<check.length; i++){
            if(i<=1){
                check[i]=false;
            }
            else{
                check[i]=true;
            }
        }
        for(int i=0; i<check.length; i++){
            if(check[i]==true){
                for(int j=2; j*i <check.length; j++){
                    check[i*j]=false;
                }
            }
        }
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int count=0;
            for(int j=2; j<N/2+1; j++){
                if(check[j]==true){
                    int tmp = N-j;
                    if(check[tmp]==true){
                        count++;
                    }
                }

            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
    
}

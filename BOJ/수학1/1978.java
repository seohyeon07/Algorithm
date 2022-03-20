import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {

    public static void main(String[]arags)throws IOException{
        boolean [] check = new boolean[1001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0; i<1001; i++){
            if(i<=1){
                check[i]=false;
            }
            else{
                check[i]=true;
            }
        }
        for(int i=0; i<1001; i++){
            if(check[i]==true){
                for(int j=2; i*j<1001; j++){
                    check[i*j]=false;
                }
            }
        }
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(check[a]==true){
                count++;
            }

        }
        System.out.println(count);
    }
}

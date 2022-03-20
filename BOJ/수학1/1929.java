import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prime {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean [] check = new boolean [1000001];
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
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
                for(int j=2; i*j<check.length; j++){
                    check[i*j]=false;
                }
            }
        }
        for(int i=N; i<=M; i++){
            if(check[i]==true){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Factorial {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans=1;
        for (int i=1; i<=N; i++){
            ans = ans*i;
        }
        System.out.println(ans);

    }
}
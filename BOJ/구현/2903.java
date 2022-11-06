package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Center {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double line = 2;
        double ans=0;
        for(int i=0; i<N; i++){
            line = line + Math.pow(2,i);
            ans = Math.pow(line,2);
        }
        System.out.println((int)ans);
    }
}

package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    static final int mod = 9901;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][]d = new int [N+1][3];

        d[1][0]=1;
        d[1][1]=1;
        d[1][2]=1;
        for(int i=2; i<=N; i++){
            d[i][0]=(d[i-1][0] + d[i-1][1] + d[i-1][2]) % mod;
            d[i][1]=(d[i-1][0] + d[i-1][2]) % mod;
            d[i][2]=(d[i-1][0] + d[i-1][1]) % mod;
        }
        int ans = (d[N][0] +d[N][1] +d[N][2]) % mod;
        System.out.println(ans);
    }
}

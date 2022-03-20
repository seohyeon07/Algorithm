package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sum3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long []d= new long[1000001];
        d[0]=0;
        d[1]=1;
        d[2]=2;
        d[3]=4;

        for(int i=4; i<1000001; i++){
            d[i]= (d[i-1]+d[i-2]+d[i-3]) % 1000000009;
        }
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(d[n]%1000000009).append("\n");
        }
        System.out.print(sb);
    }
}

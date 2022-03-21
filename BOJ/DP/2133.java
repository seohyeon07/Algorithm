package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long [] d = new long [N+1];
        d[0]=1;
        for(int i=2; i<=N; i+=2){
            d[i]=3*d[i-2];
            for(int j=i-4; j>=0; j-=2){
                d[i]+=2*d[j];
            }
        }
        System.out.println(d[N]);
    }
}

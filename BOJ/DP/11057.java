package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ascent {
    static final int mod = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][]d = new int [N+1][11];
        int ans = 0;
        for(int i=0; i<=9; i++){ //길이가 1인 오르막 수 => 0~9까지 1가지
            d[1][i]=1;
        }
        for(int i=2; i<=N; i++){
            for(int j=0; j<=9; j++) {
                for (int k = 0; k <= j; k++) { //길이가 i이고 j가 마지막 수 인 오르막 수
                    d[i][j] += d[i - 1][k];
                    d[i][j] %= mod;
                }
            }
        }
        for(int i=0; i<=9; i++){
            ans +=d[N][i];
            ans%=mod;
        }
        System.out.println(ans);
    }
}

package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][]dp=new int[101][11];
        long ans=0;

        for(int i=1; i<=9; i++){
            dp[1][i]=1; //계단의 길이가 1일때는 모두 1가지씩
        }
        for(int i=2; i<=N; i++){
            for(int j=0; j<=9; j++){
                if(j-1>=0){
                    dp[i][j]+=dp[i-1][j-1]; //인접한 수가 1작을 때 -> 0은 불가 j-1은 0이상
                }
                if(j+1<=9){
                    dp[i][j]+=dp[i-1][j+1]; //인접한 수가 1클 때 -> 10은 올 수 없으므로 j+1은 9이하
                }
                dp[i][j]%=1000000000;
            }
        }
        for(int i=0; i<=9; i++){
            ans+=dp[N][i];
        }
        System.out.println(ans%1000000000);
    }
}

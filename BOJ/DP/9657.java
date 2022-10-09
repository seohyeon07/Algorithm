package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoneGame{
    //상근(sk)가 먼저 게임 시작
    //돌이 1개, 3개, 4개, 5개 남았을 때는 항상 상근이 승

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(br.readLine());
        int []dp = new int [1001];
        //int  winner = 0; // sk 승 = 1, cy 승 = 0
        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        dp[4] = 1;
        dp[5] = 1;

        for(int i=6; i<=stone; i++){

            dp[i] = 0;
            if(dp[i-1] == 0 || dp[i-3] == 0 || dp[i-4] == 0){ // 이전 차례(창영)후 1,3,4개가 남으면 창영이 패 , 상근이 승
                dp[i] = 1;
            }
        }

        if(dp[stone] == 1){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }

    }



}

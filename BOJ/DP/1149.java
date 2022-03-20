package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [][] rgb = new int[N+1][4];
        int [][] d = new int [N+1][4];


        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=3; j++){
                rgb[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            d[i][1] = Math.min(d[i-1][2], d[i-1][3]) + rgb[i][1];//빨강 색이 마지막집일 뗴
            d[i][2] = Math.min(d[i-1][1], d[i-1][3]) + rgb[i][2];//초록 색이 마지막집일 때
            d[i][3] = Math.min(d[i-1][1], d[i-1][2]) + rgb[i][3];//파랑 색이 마지막집일 때
        }
        System.out.println(Math.min(Math.min(d[N][1],d[N][2]),d[N][3]));
    }
}
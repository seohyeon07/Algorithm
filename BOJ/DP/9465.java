package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int [][]sticker = new int [2][n+1];
            int [][]d = new int [2][n+1];
            for(int j=0; j<2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=1; k<=n; k++){
                    sticker[j][k]=Integer.parseInt(st.nextToken());
                }
            }
            d[0][1]=sticker[0][1];
            d[1][1]=sticker[1][1];

            for(int j=2; j<=n; j++){
                d[0][j]=Math.max(d[1][j-1],d[1][j-2]) + sticker[0][j];
                d[1][j]=Math.max(d[0][j-1],d[0][j-2]) + sticker[1][j];
            }
            System.out.println(Math.max(d[0][n],d[1][n]));
        }
    }
}

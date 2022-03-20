package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[][] D = new long[100001][4];
        D[1][1] = 1; //1
        D[2][2] = 1; //2
        D[3][1] = 1; //2+1
        D[3][2] = 1; //1+2
        D[3][3] = 1; //3
        for(int i=4; i<100001; i++){
            D[i][1]= (D[i-1][2]+D[i-1][3]) % 1000000009;
            D[i][2]= (D[i-2][1]+D[i-2][3]) % 1000000009;
            D[i][3]= (D[i-3][1]+D[i-3][2]) % 1000000009;
        }
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append((D[n][1]+D[n][2]+D[n][3]) % 1000000009).append("\n");
        }
        System.out.print(sb);
    }
}
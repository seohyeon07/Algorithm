package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []card = new int[10001];
        int []d = new int[1001];

        for(int i=1; i<=N; i++){
            card[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                d[i]=Math.max(d[i],d[i-j]+card[j]);
            }
        }
        System.out.println(d[N]);
    }
}

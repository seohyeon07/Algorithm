package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][]triangle = new int[n+1][n+1];
        int [][]d= new int [n+1][n+1];

        for(int i=1; i<=n; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++){
                triangle[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int ans=0;
        d[1][1]=triangle[1][1];
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1){
                    d[i][j]=triangle[i][j] +d[i-1][j];
                }
                d[i][j]=Math.max(d[i-1][j], d[i-1][j-1])+triangle[i][j];
                }
            }
        for(int i=1; i<=n; i++){
            if(ans<d[n][i]){
                ans=d[n][i];
            }
        }
        System.out.println(ans);
    }
}

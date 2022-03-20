package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumDecomposition {
    static final int mod = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //합이 n
        int K = Integer.parseInt(st.nextToken()); //정수 k개

        int [][]d=new int [201][201];
        d[0][0]=1;//[정수가 0개인][합이 0인]

        for(int i=1; i<=K; i++){
            for(int j=0; j<=N; j++) {
                for (int l = 0; l <= j; l++) {
                    d[i][j] += d[i - 1][j - l]; //[j를 제외한 총개수][합N에서 j를 뺀 값]
                    d[i][j]%=mod;
                }
            }
        }
        System.out.println(d[K][N]);
    }
}

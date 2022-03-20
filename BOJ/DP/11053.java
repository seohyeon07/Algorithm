package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []d= new int[N+1];
        int []A = new int[N+1];
        int max = 0;
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            d[i]=1;
            for(int j=0; j<=i; j++){
                if(d[i]<d[j]+1 && A[i]>A[j]){
                    d[i]=d[j]+1;
                }
                if(d[i]>max){
                    max=d[i];
                }
            }
        }
        System.out.println(max);
    }
}

package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BIS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []A=new int [N+1];
        int[]d=new int [N+1]; // i가 마지막 숫자일때 의 최대 증가 합
        for(int i=1; i<=N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int max=A[1];
        for(int i=1; i<=N; i++){
            d[i]=A[i];
            for(int j=1; j<i; j++){
                if(A[i]>A[j]){
                    d[i]=Math.max(d[i],d[j]+A[i]);
                }
            }
            max=Math.max(max,d[i]);
        }
        System.out.println(max);
    }
}

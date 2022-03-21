package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutiveSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []A = new int [n+1];
        int []d = new int [n+1];
        int []d2 = new int [n+1];
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){ //i번째 수에서 끝나는 최대 연속합
            if(i==0){
                d[i]=A[i];
            }
            else{
                d[i]=Math.max(A[i],d[i-1]+A[i]);
            }
            ans=Math.max(d[i],ans);
        }
        for(int i=n-1; i>=0; i--){ //i번째 수에서 시작하는 최대 연속합
            if(i==n-1){
                d2[i]=A[i];
                continue;
            }
            d2[i]=Math.max(A[i],d2[i+1]+A[i]);
        }

        for(int i=1; i<n-1; i++){ //i번째를 제외한 합(tmp)과 i번째를 포함한 값(ans) 비교
            int tmp = d[i-1]+d2[i+1];
            ans = Math.max(tmp,ans);
        }
        System.out.println(ans);
    }
}

package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LDS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []A=new int [N+1];
        int []d=new int [N+1]; //각 A[i]가 부분수열의 마지막 수일 때 가장 긴 감소 길이 저장.
        int ans=0;
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            d[i]=1; //자기 자신만 있을 때 1개 로 초기화
            for(int j=0; j<i; j++){
                if(A[i]<A[j] && d[i] < d[j]+1){
                    d[i]=d[j]+1;
                }
            }
            ans=Math.max(ans,d[i]);
        }
        System.out.println(ans);

    }
}

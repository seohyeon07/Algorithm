package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class LIS4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []A = new int [N+1];
        int []d= new int [N+1];
        int []ans = new int[N+1];
        int max=0;
        int a=-1;
        for(int i=0; i<N; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            d[i]=1;
            for(int j=0; j<=i; j++) {
                if (d[i] < d[j] + 1 && A[i] > A[j]) {
                    d[i] = d[j] + 1;
                    ans[i]=j;
                }
                if (max < d[i]) {
                    max = d[i];
                }
            }
        }

        sb.append(max).append("\n");

        //역추적

        int value = max;
        Stack<Integer> stack = new Stack<>();
        for( int i=N; i>=0; i--){
            if(value == d[i]){
                stack.push(A[i]);
                value--;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);
    }
}

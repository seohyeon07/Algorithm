package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM5 {
    static StringBuilder sb = new StringBuilder();
    static int []ans = new int[10001];
    static int []array = new int[10001];
    static boolean []check = new boolean[10001];
    static void go(int index, int N, int M){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<N; i++){
            if(check[array[i]]) {
                continue;
            }
            check[array[i]]=true;
            ans[index]=array[i];
            go(index+1,N,M);
            check[array[i]]=false; // 한 수열 완료 후 다시 되돌려 놓기.(사용안한 상태로)

        }
    }
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            array[i]=Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(array,0,N);
        go(0,N,M);
        System.out.print(sb);
    }
}

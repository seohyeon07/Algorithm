package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM6 {

    static int [] array = new int[10001];
    static int [] ans = new int[10001];
    static StringBuilder sb = new StringBuilder();

    static void go(int index,int start, int N, int M){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<N; i++){
            ans[index]=array[i];
            go(index+1,i+1,N,M);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            array[i]=Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(array,0,N);
        go(0,0,N,M);
        System.out.print(sb);

    }
}

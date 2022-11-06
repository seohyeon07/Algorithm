package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM4 {

    static StringBuilder sb = new StringBuilder();
    static int [] array = new int [9];
    static void go(int index, int start, int N, int M){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<=N; i++){
            array[index]=i;
            go(index+1, i, N,M);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        go(0,1,N,M);
        System.out.print(sb);
    }
}

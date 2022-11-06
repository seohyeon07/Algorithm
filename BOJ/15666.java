package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM12 {

    static int N,M;
    static int []array;
    static int [] ans;
    static StringBuilder sb = new StringBuilder();

    static void go(int index, int start){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int before = 0;
        for(int i=start; i<N; i++){
            if(before!=array[i]){
                ans[index]=array[i];
                before=array[i];
                go(index+1,i);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        array = new int[10001];
        for(int i=0; i<N; i++){
            array[i]=Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(array,0,N);

        ans = new int[10001];
        go(0,0);

        System.out.print(sb);
    }
}

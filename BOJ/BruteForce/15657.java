package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM8 {

    static StringBuilder sb = new StringBuilder();
    static int [] array;
    static int [] ans;

    static void go(int index,int start,int N, int M){
        if(index==M){
            for(int i=0; i<M; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<N; i++){
            ans[index]=array[i];
            go(index+1,i,N, M);  //배열이 정렬되어 있고 중복이 가능함으로 i값을 전달해 사전순으로 증가하도록 만듬.
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        array = new int [10001];
        for(int i=0; i<N; i++){
            array[i]=Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(array,0,N);

        ans = new int [10001];
        go(0,0,N,M); //정렬된 array 0번째 인덱스부터 선택
        System.out.print(sb);

    }
}

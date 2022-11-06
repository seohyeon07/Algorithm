package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM2 {
    static int [] array = new int [10];
    static StringBuilder sb = new StringBuilder();
    static void go(int index,int start, int N, int M){
        if(index==M) {
            for (int j = 0; j < M; j++) {
                sb.append(array[j]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<=N; i++){
            array[index]=i;
            go(index+1,i+1,N,M); // for문의 start값을 이전 값보다 큰 값부터 시작해서 중복이 없으며 오름차순이 되도록
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        go(0,1,N,M); //자연수이므로 1부터 선택해서 시작하도록
        System.out.print(sb);
    }
}

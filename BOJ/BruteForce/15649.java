package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM1 {
    static StringBuilder sb = new StringBuilder();
    static boolean []check = new boolean[10];
    static int []array = new int[10];
    static void go(int index, int N, int M){
        if(index == M){
            for(int i=0; i<index; i++){
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1; i<=N; i++){ //1-N 자연수 중복 확인
            if(check[i]){ //이미 사용한 숫자라면 통과
                continue;
            }
            //사용한 숫자가 아니면 i를 선택
            check[i]=true; // 사용한 숫자로 바꿔주고
            array[index]=i; //  i숫자 넣어주기.
            go(index+1,N,M); //다음 자리수로 이동하기.
            check[i]=false;
            array[index]=0; // 끝까지 돌았으니까 사용하지 않았다고 원래 상태로 돌려놓기.
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        go(0,N,M); //첫번째(0)부터 값 전달 순서대로 수열 만들기.
        System.out.println(sb);
    }
}

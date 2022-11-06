package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans=0;

        for(int start = 1, len=1; start<=N; start*=10, len++){ //for문에 변수 2개 넣을 때는 타입이 동일해야 함.
            int end = start*10 -1;
            if(end > N){
                end=N;
                ans += (end-start + 1) * len;
                break;
            }
            ans += (end - start +1) * len;
        }
        System.out.println(ans);
    }
}

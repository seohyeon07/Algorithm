package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++){
            boolean check = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) -1; // % 했을 때 0 나오는 거 방지
            int y = Integer.parseInt(st.nextToken()) -1;

            for(int j=x; j<M*N; j+=M){
                if(j%N == y){
                    int ans = j+1; //위에서 -1 한거 원상태
                    sb.append(ans).append("\n");
                    check = true;
                    break;
                }
            }
            if(!check){
                sb.append(-1).append("\n");
            }
        }
        System.out.print(sb);
    }
}

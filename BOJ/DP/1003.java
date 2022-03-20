package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int []zero = new int [41];  //0의 개수 저장.
        int []one = new int[41];  //1의 개수 저장.
        zero[0]=1;  //0일때 0의 개수는 1개
        one[0]=0; //0일때 1의 개수는 0개
        zero[1]=0; //1일때 0의 개수는 0개
        one[1]=1; //1일때 1의 개수는 1개
        for(int i=2; i<41; i++){
            zero[i]=zero[i-1]+zero[i-2];
            one[i]=one[i-1]+one[i-2];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(zero[N]).append(" ").append(one[N]).append("\n");
        }
        System.out.print(sb);
    }
}

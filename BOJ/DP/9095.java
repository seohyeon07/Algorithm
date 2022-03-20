package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int [] Case = new int [12];
        Case[0]=1;
        Case[1]=1;
        Case[2]=2;

        for(int i=3; i<12; i++){
            Case[i]= Case[i-1]+Case[i-2]+Case[i-3];
        }
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(Case[N]).append("\n");
        }
        System.out.print(sb);
    }
}

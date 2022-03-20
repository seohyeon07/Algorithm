package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []d= new int[91];
        d[1]=1;
        for(int i=2; i<=90; i++){
            d[i]=d[i-1]+d[i-2];
        }
        System.out.println(d[N]);
    }
}

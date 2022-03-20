package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tailling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] taile = new int [1001];
        taile[0]=0;
        taile[1]=1;
        taile[2]=2;
        for(int i=3; i<taile.length; i++){
            taile[i]=(taile[i-1]+taile[i-2])%10007;
        }
        System.out.println(taile[n]);
    }
}

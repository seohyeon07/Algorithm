package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grape {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] A= new int[n+2];
        int [] d= new int[n+2];
        for(int i=1; i<=n; i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        d[1]=A[1];
        d[2]=A[1]+A[2];

        for(int i=3; i<=n; i++){
            d[i]=d[i-1];            //마지시 않음.
            if(d[i] < d[i-2]+A[i]){ //1번 연속
                d[i]=d[i-2]+A[i];
            }
            if(d[i]< d[i-3]+A[i]+A[i-1]) { //2번연속
                d[i]=d[i-3]+A[i]+A[i-1];
            }
        }
        System.out.println(d[n]);
    }
}

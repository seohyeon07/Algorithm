package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutiveSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] d = new int[N];

        for(int i=0; i<N; i++){
            array[i]=Integer.parseInt(st.nextToken());
        }
        int max=array[0];
        for(int i=0; i<N; i++) {
            d[i]=array[i];
            if(i==0){continue;}
            d[i]=Math.max(d[i-1]+array[i],d[i]);
            max= Math.max(max,d[i]);
        }
        System.out.println(max);
    }
}

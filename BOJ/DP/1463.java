package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MakeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []count=new int[1000001];
        int tmp=0;
        count[1]=0;
        count[2]=1;
        count[3]=1;
        for(int i=4; i<count.length; i++){
            count[i] =  count[i-1] +1; //-1 경우
            if(i%3==0){
                count[i] = Math.min(count[i/3]+1 , count[i]); // 나누기3 과 -1한 것 중 적게 걸리는 것 저장.
            }
            if(i%2==0){
                count[i] = Math.min(count[i/2]+1 , count[i]);
            }
        }
        System.out.println(count[N]);
    }
}

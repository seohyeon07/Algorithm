package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans=0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int max =0;
            if(A==B && B==C){
                max=10000+A*1000;
            }
            else if(A==B || A==C){
                max=1000+A*100;
            }
            else if(B==C){
                max=1000+B*100;
            }
            else{
                int tmp = Math.max(Math.max(A,B),C);
                max=tmp*100;
            }
            ans=Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
//public class Dice {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int [][]dice = new int[N][3];
//        int ans=0;
//        int max=0;
//        for(int i=0; i<N; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j=0; j<3; j++){
//                dice[i][j]=Integer.parseInt(st.nextToken());
//            }
//        }
//        for(int i=0; i<N; i++){
//                if(dice[i][0]==dice[i][1] && dice[i][1]==dice[i][2]){
//                    max=10000+dice[i][0]*1000;
//                }
//                else if(dice[i][0]==dice[i][1] || dice[i][0]==dice[i][2]){
//                    max=1000+dice[i][0]*100;
//                }
//                else if(dice[i][1]==dice[i][2]){
//                    max=1000+dice[i][1]*100;
//                }
//                else{
//                    int tmp =Math.max(Math.max(dice[i][0],dice[i][1]),dice[i][2]);
//                    max=tmp*100;
//                }
//                ans=Math.max(ans,max);
//        }
//        System.out.println(ans);
//    }
//}

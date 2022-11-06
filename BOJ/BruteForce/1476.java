package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DateCount{
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 7980; i++) {
            if ((i - 1) % 15 == E - 1 && (i - 1) % 28 == S - 1 && (i - 1) % 19 == M - 1) {
                System.out.println(i);
                break;
            }
        }

//        int e=0;
//        int s=0;
//        int m=0;
//        int ans=0;
//
//        while(true){
//            if(e==E && s==S && m==M){
//                System.out.println(ans);
//                break;
//            }
//            e++;
//            s++;
//            m++;
//            ans++;
//            if(e==16) e=1;
//            if(s==29) s=1;
//            if(m==20) m=1;
//        }
    }
}

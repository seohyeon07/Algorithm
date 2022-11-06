package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] array = new int[10001];

        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                array[count]=i;
            }
        }
        if(count<k){
            sb.append(0);
        }
        else{
            sb.append(array[k]);
        }
        System.out.println(sb);
    }
}

package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inspection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [5];
        int sum=0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<5; i++){
            array[i]=Integer.parseInt(st.nextToken());
            array[i]*=array[i];
            sum+=array[i];
        }
        System.out.println(sum%10);

    }
}

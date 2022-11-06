package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //11
        StringTokenizer st = new StringTokenizer(br.readLine()); //1 4 1 2 4
        int v = Integer.parseInt(br.readLine()); //2
        int count = 0;

        for(int i=0; i<num; i++){
            if(Integer.parseInt(st.nextToken()) == v){
                count++;
            }
        }
        System.out.println(count);
    }
}

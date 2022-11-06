package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();

        int [] chess = {1,1,2,2,2,8};

        for(int i=0; i<chess.length; i++){
            int incomplete = Integer.parseInt(input.nextToken());
            result.append(chess[i] - incomplete).append(" ");
        }
        System.out.println(result);
        br.close();
    }
}

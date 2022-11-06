package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Convert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String array = br.readLine();
        StringTokenizer st1 = new StringTokenizer(array,"0"); //0을 기준으로 토큰 했을 때 (1의 연속된 부분)
        StringTokenizer st0 = new StringTokenizer(array,"1"); //1을 기준으로 토큰 했을 때 (0의 연속된 부분)

        System.out.println(Math.min(st1.countTokens(), st0.countTokens())); //각 연속된 부분의 개수 count
    }
}



package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinusBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
        } else {
            while (N != 0) {
                sb.append(Math.abs(N % (-2)));
                N = (int) (Math.ceil((double) N / (-2)));  //나눠 떨어지지 않을 때 올림.
            }
            System.out.println(sb.reverse());
        }
    }
}

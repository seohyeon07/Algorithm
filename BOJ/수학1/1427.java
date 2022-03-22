package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] N = br.readLine().toCharArray();

        Arrays.sort(N);
        for (int i = N.length - 1; i >= 0; i--) {
            sb.append(N[i]);
        }
        System.out.println(sb);
    }
}

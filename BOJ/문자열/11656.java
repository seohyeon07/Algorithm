import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class array {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        String [] before = new String[S.length()];
        for(int i=0; i<S.length(); i++){
            before[i]=S.substring(i);
        }
        Arrays.sort(before);
        for(int i=0; i<before.length; i++){
            sb.append(before[i]).append("\n");
        }
        System.out.print(sb);
    }   
}

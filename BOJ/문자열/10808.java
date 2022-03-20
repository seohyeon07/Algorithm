import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class alphabetNum {
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        int alphabet[] = new int[26];
        for(int i=0; i<alphabet.length; i++){
            alphabet[i]=0;
        }

        for(int i=0; i<S.length(); i++){
            alphabet[S.charAt(i)-97]++;
        }
        for(int i=0; i<alphabet.length; i++){
            sb.append(alphabet[i]).append(" ");
        }
        System.out.println(sb);

    }
}

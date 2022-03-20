import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rot13 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)-'a'>=0 && S.charAt(i)-'z'<=25){
                int tmp = S.charAt(i);
                if(tmp+13>122){
                    tmp=tmp+13-26;
                    sb.append((char)(tmp));
                }
                else {
                tmp=tmp+13;
                sb.append((char)(tmp));
                }
            }
            else if(S.charAt(i)-'A'>=0 && S.charAt(i)-'Z'<=25){
                int tmp = S.charAt(i);
                if(tmp+13>90){
                    tmp=tmp+13-26;
                    sb.append((char)(tmp));
                }
                else{
                tmp=tmp+13;
                sb.append((char)(tmp));
                }
            }

            else{
                sb.append(S.charAt(i));
            }    
        }
        System.out.println(sb);
    }
}
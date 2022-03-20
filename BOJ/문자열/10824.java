import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number4 {
    public static void main (String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String appendA=st.nextToken() + st.nextToken();
        String appendB=st.nextToken() + st.nextToken();
        long A = Long.parseLong(appendA);
        long B = Long.parseLong(appendB);
        long result = A + B;
        System.out.println(result);
    }
}

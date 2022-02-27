import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int newA=change(A);
        int newB=change(B);

        if(newA>newB){
            System.out.println(newA);
        }
        else{
            System.out.println(newB);
        }

    }

    public static int change(String x){
        int A = ( ((x.charAt(2)-'0') * 100 ) + ( (x.charAt(1)-'0') * 10) + (x.charAt(0)-'0'));
        return A;
    }
}
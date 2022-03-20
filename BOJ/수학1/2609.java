import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDLCM {

    static int GCD(int A, int B){
        int tmp=0;
        if(B!=0){
            tmp=A%B;
            A=B;
            B=tmp;
            return GCD(A,tmp);
        }
        else{
            return A;
        }

    }
    static int LCM(int A, int B){
        return A*B/GCD(A,B);

    }
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer str = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        sb.append(GCD(A, B)).append("\n");
        sb.append(LCM(A, B)).append("\n");
        System.out.print(sb);
    }
}

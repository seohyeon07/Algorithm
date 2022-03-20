import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Remain{

    static int cal1(int A, int B, int C){
        int ans=0;
        ans = (A+B)%C;
        return ans;
    }
    static int cal2(int A, int B, int C){
        int ans=0;
        ans = ((A%C) + (B%C))%C;
        return ans;
    }
    static int cal3(int A, int B, int C){
        int ans=0;
        ans = (A*B)%C;
        return ans;
    }
    static int cal4(int A, int B, int C){
        int ans=0;
        ans = ((A%C)*(B%C))%C;
        return ans;
    }    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer str = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int C = Integer.parseInt(str.nextToken());
        sb.append(cal1(A,B,C)).append("\n");
        sb.append(cal2(A,B,C)).append("\n");
        sb.append(cal3(A,B,C)).append("\n");
        sb.append(cal4(A,B,C)).append("\n");
        System.out.print(sb);
    }
    
}

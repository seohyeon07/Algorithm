import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuteNotcute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cuteCount=0;
        int notCuteCount=0;
        for(int i=0; i<N; i++){
            int cuteQ = Integer.parseInt(br.readLine());
            if(cuteQ==1){
                cuteCount++;
            }
            else{
                notCuteCount++;
            }
        }
        if(cuteCount<notCuteCount){
            System.out.println("Junhee is not cute!");
        }
        else{
            System.out.println("Junhee is cute!");
        }
    }
}

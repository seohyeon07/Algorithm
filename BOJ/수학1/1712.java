import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakevenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixed = Integer.parseInt(st.nextToken());  //고정 비용
        int changed = Integer.parseInt(st.nextToken()); // 1대당 비용 - 가변 비용
        int laptop = Integer.parseInt(st.nextToken());  //노트북 가격

        if(laptop<=changed){
            System.out.println("-1");
        }
        else{
            int ans=fixed/(laptop-changed)+1;
            System.out.println(ans);
        }
    }
}

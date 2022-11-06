package Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Even {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int j=0; j<7; j++){
                int tmp=Integer.parseInt(st.nextToken());
                if(tmp%2==0){
                    sum+=tmp;
                    if(tmp<min){
                        min=tmp;
                    }
                }
            }
            sb.append(sum).append(" ").append(min).append("\n");
        }
        System.out.print(sb);
    }
}

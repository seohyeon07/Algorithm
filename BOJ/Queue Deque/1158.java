import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {
    public static void main (String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue <Integer>queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        sb.append("<");
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        for(int i=1; i<=N; i++){
            for(int j=1; j<=K; j++){
                    if(j==K){
                        sb.append(queue.poll()).append(", ");
                    }
                    else{
                        int ans = queue.poll();
                        queue.add(ans);
                    }
            }
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}

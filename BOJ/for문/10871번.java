
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Small {
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(stt.nextToken());
		int x = Integer.parseInt(stt.nextToken());
		
		
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb= new StringBuilder();
		
		
		for(int i=0; i<n; i++) {
			int tem=Integer.parseInt(st.nextToken());
			if(tem<x) {
				sb.append(tem).append(" ");
			}
		}
		System.out.println(sb);
		
	}

}

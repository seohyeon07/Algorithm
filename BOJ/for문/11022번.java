
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ApulsBcase {
	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());

			
			sb.append("Case #"+i+": ");	

			int n1 =Integer.parseInt(st.nextToken());
			int n2  =Integer.parseInt(st.nextToken());
			//sb.append("Case #").append(String.valueOf(i)).append(": ").append(String.valueOf(n1))
			//.append(" + ").append(String.valueOf(n2)).append(" = ").append(String.valueOf(n1+n2));
			int sum=n1+n2;
			
			sb.append(n1 +" + "+n2+" = "+sum+"\n");


		}
		System.out.println(sb);
		
	}
}

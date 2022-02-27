
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StarPoint {
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=n; i>0; i--) {
			for(int j=i; j>1; j--) {
			sb.append(" ");
			}
			for(int k=n-i; k>=0; k--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

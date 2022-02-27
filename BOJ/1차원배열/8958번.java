

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class OX {
	public static void main(String[]args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb= new StringBuilder();
		
		
		int count=0;
		int sum=0;
		
		int N = Integer.parseInt(br.readLine());
		String []s =new String[N];
		
		
		for(int i=0; i<N; i++) {
			s[i] = br.readLine();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<s[i].length(); j++) {
				if(s[i].charAt(j)=='O') {
					count++;
					sum+=count;
				}
				if(s[i].charAt(j)=='X') {
					count=0;
				}
			}
			count=0;
			sb.append(sum).append("\n");
			sum=0;
		}
		System.out.println(sb);
	}
}

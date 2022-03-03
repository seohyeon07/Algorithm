
import java.io.*;
import java.io.IOException;



public class wordReverse {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		
		StringBuilder sb = new StringBuilder();

		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			int tmp=0;
			str = str+"\n";
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)==' ' || str.charAt(j)=='\n') {
					for(int k=j-1; k>=tmp; k--) {
						sb.append(str.charAt(k));	
					}
					sb.append(" ");
					tmp = j+1;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
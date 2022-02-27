
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class apulsb {
	public static void main(String[]args) throws IOException {
		
		//InputStreamReader ir= new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(ir);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//String a1 = br.readLine();
		//int num= Integer.paraseInt(a1); 
		
		int num = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			st= new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}

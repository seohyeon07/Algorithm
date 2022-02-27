
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class MinMax {
	public static void main(String []args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");;
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int array[]= new int[n]; 
		
		for(int i=0; i<n; i++) {
			array[i]= Integer.parseInt(st.nextToken());

			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}

}

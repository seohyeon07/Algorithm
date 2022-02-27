
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		double [] array= new double [1001];
		double max=0;
		double sum=0;
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(max<array[i]) {
				max=array[i];
			}
		}
		for(int i=0; i<N; i++) {
			array[i]=array[i]/max*100;
			sum+=array[i];
			//sun+=(array[i]/max*100);
		}
		System.out.println(sum/N);	
		
	}
}

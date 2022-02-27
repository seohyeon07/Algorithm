
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class sum {
	public static void main(String[]args) throws IOException{
		
//		InputStreamReader ir= new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}

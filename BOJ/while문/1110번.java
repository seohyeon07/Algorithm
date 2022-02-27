

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PulsCycle {
	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int newN;
		int count=0;
		int originalN =N;
		
		while(true){
			int L = N/10;
			int R = N%10;
			int sum=L+R;
			newN=(R*10)+(sum%10);
			N=newN;
			count++;
			if(N==originalN) {
				break;
			}
		}
		System.out.println(count);
		
	}

}

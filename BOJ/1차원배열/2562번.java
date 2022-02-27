

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Max {
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] array = new int[9];
		int min=100;
		int max=0;
		int maxindex=0;
		
		for(int i=0; i<9; i++) {
			array[i]= Integer.parseInt(br.readLine());
			
			if(array[i]>max) {
				max=array[i];
				maxindex=i;
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(maxindex+1);
	}

}

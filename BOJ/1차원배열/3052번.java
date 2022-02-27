
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Remainder {
	public static void main(String []args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int []array= new int [42];
		 int num;
		 int count=0;
		 
			
		for(int i=0; i<10; i++) {
				array[i]=0;
		 }
		
		 for(int i=0; i<10; i++) {
			 num=Integer.parseInt(br.readLine());
			 array[num%42]++;
		 }
		 for(int i=0; i<42; i++) {
			 if(array[i]>=1) {
				 count++;
			 }
		 }
		 System.out.println(count);
	}

}

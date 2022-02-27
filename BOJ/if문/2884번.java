

import java.util.*;
public class Clock {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H= scanner.nextInt();
		int M= scanner.nextInt();
		int sum, result, hour, min;
		
		scanner.close();

		sum= 60*H + M;
		result= sum-45;

		
		if(result<0) {
			result= 24*60 + result;
		}
		
		hour= result/60 ;
		min=result%60;
		
		
		System.out.print(hour + " ");
		System.out.print(min);
	}

}

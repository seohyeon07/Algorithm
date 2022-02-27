
import java.util.*;

public class Oven {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M= scanner.nextInt();
		int make=scanner.nextInt();
		int sum,result, hour, min;
		scanner.close();
		
		sum = H*60 +M;
		result =sum+make;
		hour=result/60;
		min=result%60;
		
		if(hour==24) {
			hour=0;
		}
		System.out.print(hour+" ");
		System.out.print(min);
		
	}

}
